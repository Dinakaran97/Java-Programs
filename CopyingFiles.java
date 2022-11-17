package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("edubridge.txt");
FileInputStream f1=new FileInputStream("copyvalue.txt");
FileOutputStream fo=new FileOutputStream("copy2files.txt");
SequenceInputStream ss=new SequenceInputStream(f,f1);
int i;
while((i=ss.read())!=-1){
	fo.write(i);
}
f.close();
f1.close();
fo.close();
ss.close();
	}

}
