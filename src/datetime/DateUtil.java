package datetime;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bipin on 4/6/16.
 */
public class DateUtil {


    private final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss.SSSZ";
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_TIME_PATTERN);
    private final static String DAY_FORMAT = "yyyy-MMM-dd";

    public static String today() {
        return SIMPLE_DATE_FORMAT.format(new Date());
    }

    public static Date addNoOfDay(Date date, int noOfDays) {
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, noOfDays); //minus number would decrement the days
        return cal.getTime();
    }

    public static String convertDate(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public static String convertDateToStringDate(Date date) {
        Format formatter = new SimpleDateFormat(DAY_FORMAT); //2016-Jan-12
        return formatter.format(date);
    }
}
