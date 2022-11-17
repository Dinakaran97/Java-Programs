package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fs=new FileInputStream("edubridge.txt");
			int i=0;
			while((i=fs.read())!=-1) {
				System.out.print((char)i);
				
			}
			fs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
