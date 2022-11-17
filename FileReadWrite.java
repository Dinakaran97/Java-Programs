package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fs=new FileInputStream("edubridge.txt");
FileOutputStream fo=new FileOutputStream("copyvalue.txt");
int i=0;
while((i=fs.read())!=-1) {
	if(i>=97 && i<=122) {
		
		fo.write((i-32));
	}
	else {
		fo.write(i);
	}
	
}
System.out.println("new files have been copied");
fs.close();
fo.close();
	}

}
