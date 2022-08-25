package Assignment;

import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) 
	{
		
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int number=sc.nextInt();
		 
		 int lastDigit=number%10;
		 
		 int firstDigit=number;
		 while(firstDigit>=10) {
			 firstDigit=firstDigit/10;
		 }
		 System.out.println("first Digit="+firstDigit);
		 System.out.println("Last Digit="+lastDigit);
	}		 


}