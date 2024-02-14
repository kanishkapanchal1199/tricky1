import java.util.EnumSet;
import java.util.Set;

public class que5 {
    private enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        public static Set<Days> allDays = EnumSet.allOf(Days.class);

        public static Set<Days> weekDays = EnumSet.range(Monday, Friday);

        public boolean isWeekDay() {
            return weekDays.contains(this);
        }
    }

    public static void main(String[] args) {
        System.out.println(Days.weekDays.size());

        Days day=Days.Monday;
        System.out.println(day.isWeekDay() ? "is Weekday":"is Weekend");

        day=Days.Sunday;
        System.out.println(day.isWeekDay() ? "is Weekday":"is Weekend");

        day=Days.Monday;
        System.out.println(Days.allDays.contains(day));

        System.out.println(day.ordinal());
    }
}
