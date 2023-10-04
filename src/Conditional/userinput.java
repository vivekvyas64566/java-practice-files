package Conditional;
import java.util.Scanner;


public class userinput {
   
	public static void main(String[] args) {
 		 
		   Scanner sc =new Scanner(System.in);
		    
		   System.out.println("Enter 1st num");
		  
 			int a= sc.nextInt();
 			
 			System.out.println(" 2nd num ");
 			int b= sc.nextInt();
 			
 			System.out.println("3rd num");
 			
 			int c= sc.nextInt();
 			
 			if ((a>b) && (a>c))
 			{
 				System.out.println("A is the greatest value");
 			}
 			else if ((b>a)&& (b>c))
 			{
 				System.out.println("B is greates value");
 			}
 			else if ((c>a)&&(c>b))
 			{
 				System.out.println("C is greatest value");
 			}
 			
 			else
 			{
 				System.out.println("invailid number");
 			}
 			
 			
 				
 			
 			
 		 }
	}

    