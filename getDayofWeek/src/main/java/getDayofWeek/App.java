package getDayofWeek;

import java.util.Calendar;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 8, 05);
        System.out.println("" + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
        System.out.println();
	}

}
