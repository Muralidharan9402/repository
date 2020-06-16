import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ZoneStarterQuiz 
{
	public static void main(String pars[]) 
	{
		LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 11);//line 1
		LocalDate date2 = LocalDate.of(2016, 11, 12);
		System.out.println(date1.compareTo(date2));
		
		
		/*LocalDate date = LocalDate.of(12, 11, 2016);
		System.out.println(date);*/
		
		/*LocalDate date3 = LocalDate.of(2016, 04, 01);
		LocalDate date4 = LocalDate.of(2016, 04, 31);
		long duration = ChronoUnit.DAYS.between(date3, date4);
		System.out.println(duration);
		*/
		
		LocalDate date = LocalDate.of(2016, 11, 13);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy",Locale.UK);
		System.out.println(date.format(formatter));
	}
}