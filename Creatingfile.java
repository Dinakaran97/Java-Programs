package Filehandling;

import java.io.File;
import java.io.IOException;

public class Creatingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Creating a new File");
File f=new File("edubridge.txt");
if(f.createNewFile()) {
	System.out.println("File is created");
}
else {
	System.out.println("File already exists");
}
}
	

}
