package Edubridgeprograms;

import java.util.Scanner;
@SuppressWarnings("serial")
class checking extends Exception{
	checking(String s){
		super(s);
	}
}
public class ExceptionCheck {
	public void vote() {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		try {
			if(age<18) {
				throw new checking ("age is invalid");
			}
			else {
				System.out.println("you are eligble to vote");
			}
		}
		catch(checking e) {
			System.out.println(e.getMessage());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExceptionCheck  e=new ExceptionCheck();
e.vote();
	}

}
