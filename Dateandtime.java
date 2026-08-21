import java.util.Calendar;
import java.util.Locale;

class Dateandtime {
     public static  String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        
        // Set the fields (Subtract 1 from month because Calendar months are 0-indexed)
        cal.set(year, month - 1, day);
        
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

}