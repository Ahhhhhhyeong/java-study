package test;

import java.awt.TexturePaint;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class TCPClient {
	private static final String SERVER_IP_STRING = "127.0.0.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {
		Socket socket = null;
		try {
			
			// 1. 소켓생성
			socket = new Socket();

			// 1-1. 소켓 버퍼 사이즈 확인
			int rcvBufferSize = socket.getReceiveBufferSize();
			int sndBufferSize = socket.getSendBufferSize();
			System.out.println(rcvBufferSize + ":" + sndBufferSize);
			
			// 1-2. 소켓 버퍼 사이즈 변경
			socket.setReceiveBufferSize(1024 * 10); //10k
			socket.setSendBufferSize(1024 * 10); //10k
			rcvBufferSize = socket.getReceiveBufferSize();
			sndBufferSize = socket.getSendBufferSize();
			System.out.println(rcvBufferSize + ":" + sndBufferSize);
			
			// 1-3. SO_NODELAY(Nagle Algorithm off)
			socket.setTcpNoDelay(true);

			// 1-4. SO_TIMEOUT
			socket.setSoTimeout(sndBufferSize);
			
			
			// 2. 서버연결
			socket.connect(new InetSocketAddress(SERVER_IP_STRING, SERVER_PORT));
			
			
			
			// 3. IO Strean 받아오기
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 4. 쓰기
			String data = "Hello World";
			
			os.write(data.getBytes("utf-8"));;
			
			// 5. 읽기
			byte[] buffer = new byte[256];
			int readByCnt = is.read(buffer);
			if(readByCnt == -1) {
				System.out.println("[client] Closed by server");
				return;
			}
			
			data = new String(buffer, 0, readByCnt, "utf-8");
			
		} catch (SocketTimeoutException e) {
			System.out.println("[client] Time Out! ");
		}catch (SocketException ex) {
			System.out.println("[client] suddenly closed by server ");
		} catch (IOException e) {
			System.out.println("[client] error: " + e);
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
