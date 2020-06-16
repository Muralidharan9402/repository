import java.time.Period;

public class DateTimeSample {
	public static void main(String[] args) {
	       Period period = Period.of(2001, 6, 21);
	       System.out.println(period.getDays() + "\t" + period.getMonths());
	}
}