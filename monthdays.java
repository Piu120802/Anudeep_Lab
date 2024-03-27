package Anudipp;
import java.time.Month;
import java.time.YearMonth;
public class monthdays 
{
	    public static void main(String[] args) {
	        // Loop through each month
	        for (Month month : Month.values()) {
	            // Get the number of days in the month for a non-leap year
	            int daysInMonth = YearMonth.of(2024, month).lengthOfMonth();
	            
	            // Print the month name and the number of days
	            System.out.println(month.toString() + ": " + daysInMonth + " days");
	        }
	    }
}

