package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Localhost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();
									
			System.out.println(hostName);
			System.out.println(hostAddress);
			
			byte[] address = inetAddress.getAddress();
			for(byte addr : address) {
				System.out.print(addr & 0x000000ff);
				System.out.print(".");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
