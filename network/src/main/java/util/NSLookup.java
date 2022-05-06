package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InetAddress inetaddr[] = null;

		while (true) {
			try {
				System.out.print("도메인을 입력하시오.>>");
				String line = scanner.nextLine();
				
				if(line.equals("exit")) {
					break;
				}
				
				inetaddr = InetAddress.getAllByName(line);
				System.out.println(inetaddr[0].getHostAddress());
				
			} catch (UnknownHostException e) {
				System.out.println("[Error] : " + e);
			}

		}

	}
}
