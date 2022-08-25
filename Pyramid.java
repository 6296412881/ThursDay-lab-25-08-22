package Assignment;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		
		  int row, i,k, j;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Number of Rows (Line): ");
	      row = s.nextInt();
	      
	      for(i=0; i<row; i++)
	      {
	         for(k=i; k<row; k++)
	            System.out.print(" ");
	         for(j=1; j<(i*2); j++)
	            System.out.print("*");
	         System.out.print("\n");
	      }
	   }
	}	
			
		
		

	


