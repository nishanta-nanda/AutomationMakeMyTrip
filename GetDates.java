package testingBook;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDates {
	
	Date date = new Date();
	public String getSourceDate() throws ParseException
	{
		
		
	 // Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	 
	 //get current date time with Date()
	 //Date date = new Date();
	 
	DateFormat df = new SimpleDateFormat("yyyyMMdd");
	String srcdate = df.format(date);
	System.out.println("Source Date string in right format:" + srcdate);
	return srcdate; 
	}
	 
	public String getDestinationDate() throws ParseException
	{
	 Calendar cal = Calendar.getInstance();
	 cal.setTime(date);
	 cal.add(Calendar.DATE, 14); // add 14 days
	 
	 date = cal.getTime();
	 
	 DateFormat df2 = new SimpleDateFormat("yyyyMMdd");
	 String destdate = df2.format(date);
	 System.out.println("Destination Date string in right format:" + destdate);
	
	 return destdate;
	
	}
	 	
}

