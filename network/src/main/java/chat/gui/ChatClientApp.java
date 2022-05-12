package chat.gui;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import chat.ChatServer;

public class ChatClientApp {
	private static final String SERVER_IP_STRING = "127.0.0.1";
	private static final int SERVER_PORT = 9999;

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);

		Socket socket = new Socket();
		ChatServer.main(args);

		while (true) {

			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();

			if (name.isEmpty() == false) {
				break;
			}

			System.out.println("대화명은 한 글자 이상 입력해야 합니다.\n");
		}

		scanner.close();

		// 1. create socket
		// 2. connect server
		// 3. get iostream(pipline established)
		// 4. send join protocol (ex. "join:User1\n" ---> )

		try {
			socket.connect(new InetSocketAddress(SERVER_IP_STRING, SERVER_PORT));
			System.out.println("Accepted from " + socket);
			PrintWriter printWriter = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));

			// join 프로토콜
			System.out.print("nickname:" + name);
			printWriter.println("join:" + name);
			printWriter.flush();

			new ChatWindow(name, socket).show();

		} catch (IOException e) {
			System.out.println("ERROR: " + e);
			e.printStackTrace();
		} finally {
			if (socket != null && !socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
