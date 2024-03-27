/*1. Create a Java program that acts as a simple calculator. ● The program should prompt the user to enter two numbers and an operator (+, -, *, /). ● Perform the corresponding calculation based on the operator. ● Handle potential exceptions, such as division by zero or invalid operator input. ● Display the result or an appropriate error message.*/
package Anudipp;
import java.time.LocalDate;
import java.time.MonthDay;
public class independanceDayChecker 
{
	    public static void main(String[] args) 
	    {
	        LocalDate today = LocalDate.now();
	        MonthDay independenceDay = MonthDay.of(8, 15); 
	        if (MonthDay.from(today).equals(independenceDay)) 
	        {
	            System.out.println("Today is Independence Day!");
	        } 
	        else 
	        {
	            if (MonthDay.from(today).isBefore(independenceDay)) 
	            {
	                System.out.println("Independence day is yet to come this year.");
	            } 
	            else 
	            {
	                System.out.println("Independence day was already celebrated this year.");
	            }
	        }
	    }
}



