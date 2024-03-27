package Anudipp;
import java.util.Scanner;
public class inputConversion 
	{
	    public static void main(String[] args) 
	{
	       		 Scanner scanner = new Scanner(System.in);
	       		 try 
	{
	 
	       			 System.out.println("Please enter an integer:");
	            			String userInput = scanner.nextLine();
	           			 if (userInput == null) 
	{
	               					 throw new NullPointerException("Input is null.");
	          				  }
	           			 int number = Integer.parseInt(userInput);
	            			System.out.println("You entered: " + number);
	        		} 
	catch (NumberFormatException e) 
	{
	            			System.out.println("Invalid input. Please enter a valid integer.");
	        		} catch (NullPointerException e) 
	{
	            			System.out.println("Null input. Please enter a valid input.");
	        		} 
	finally 
	{
	            			scanner.close();
	        		}
	    	}
	}

