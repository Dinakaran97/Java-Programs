package Edubridgeprograms;

import java.util.Scanner;

public class LoginCredentials {
	String username,password;
	int count=3;
public void details() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter your user name:");
		username=sc.nextLine();
		System.out.println("Enter your password:");
	password=sc.nextLine();
}

public void validate() {
	if(username.equalsIgnoreCase("Dina")&& password.equals("1234")) {
		System.out.println("successfully logged in");
	}
	else if(count==3){
		System.out.println("Login or password is incorrect");
		System.out.println();
		for(int i=0;i<4;i++) {
			count--;
			
			details();
			validate();
			if(count!=0)
			System.out.println("you have"+" "+count+" " +"attempt left");
			if(count==0)
			{
				System.out.println("Login falied you must login after 24 hrs");
				break;
				
				}
			}	
		
		}

		  }

	public static void main(String[] args)throws NullPointerException {
		// TODO Auto-generated method stub
		System.out.println("User can try maximum three times to log in!");
LoginCredentials l=new LoginCredentials();
l.details();
l.validate();
	}

}
