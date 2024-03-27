package Anudipp;
import java.util.InputMismatchException;
import java.util.Scanner;
public class integerInputHandler 
{

	    public static void main(String[] args) 
	{
	        		Scanner scanner = new Scanner(System.in);
	       		 System.out.println("Please enter an integer:");
	        		try {
	           			 int number = scanner.nextInt();
	          			  System.out.println("You entered: " + number);
	       		         } 
	catch (InputMismatchException e) {
	            			System.out.println("Invalid input. Please enter an integer value.");
	        		         } 
	finally {
	          			  scanner.close();
	     		          }
	  	  }
}

