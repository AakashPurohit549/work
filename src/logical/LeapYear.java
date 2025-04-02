package logical;
import java.util.*;
public class LeapYear {
public static void main(String[] args) {
	 int year = 2025;
     boolean is_leap_year = new GregorianCalendar().isLeapYear(year);
     System.out.println(is_leap_year);
}
}

