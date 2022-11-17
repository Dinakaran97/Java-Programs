package Filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("copy2files.txt");
if(f.createNewFile()) {
	System.out.println("new file created");
}
else {
	System.out.println("file already exist");
}
	}

}
