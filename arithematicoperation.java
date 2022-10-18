package Edubridgeprograms;

public class arithematicoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2,ans;
        num1=45.342f;
        num2=12.232f;
        
        //addition
        ans=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+ans);
        
        //diff
        ans=num1-num2;
        System.out.println("The difference of "+num1+" and "+num2+" is "+ans);
	   
         //product
        ans=num1*num2;
        System.out.println("The product of "+num1+" and "+num2+" is "+ans);
        
        //Quotient(/) ex  5/2=2
        ans=num1/num2;
        System.out.println("The quotient of "+num1+" and "+num2+" is "+ans);
	
        //Remainder (%)  5%2=1
	    ans=num1%num2; 
	    System.out.println("Remainder of "+num1+" and "+num2+" is "+ans);
	}

}
