package Filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
File fs=new File("copyvalue.txt");
if(fs.createNewFile()) {
	System.out.println("File created");
}
else {
	System.out.println("File already been created");
}
	}

}
