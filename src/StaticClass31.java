import java.util.Calendar;
import java.util.TimeZone;

public class StaticClass31 {

    public static final String[][] staticStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
    public static final String[] staticStringArray4 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    public static Calendar staticCalendar2;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        staticCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    StaticClass31() throws Throwable {
        throw new Error();
    }

}
