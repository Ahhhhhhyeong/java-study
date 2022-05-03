package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;
		try {
			in = new FileReader("1234.txt");
			
			int data = -1;
			int count = 0;
			while((data = in.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			
			System.out.println("\ncount:"+count);
			System.out.println("============================");
			
			count = 0;
			data = -1;
			is = new FileInputStream("1234.txt");
			while((data = is.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.println("\ncount:"+count);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		}finally {			
				try {
					if(in != null) {
						in.close();
					}
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
		}

	}

}
