/* 2. Write a program to check if today is independence day (15th August) or not using java MonthDay class. Using the method isBefore () find out if today is before or after the independence day. If today is before independence day then print “Independence day is yet to come this year." otherwise print “Independence day was already celebrated this year.” [Perform internet search if required.]*/
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



