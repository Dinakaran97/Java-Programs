package Filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fs=new FileInputStream("edubridge.txt");
BufferedReader br=new BufferedReader(new InputStreamReader(fs));
String s=null;
while((s=br.readLine())!=null) {
	System.out.println(s);
}
	}

}
 