import java.util.Calendar;
import java.util.Scanner;

public class Solution {
  
  static private final String MONDAY = "MONDAY";
  static private final String TUESDAY = "TUESDAY";
  static private final String WEDNESDAY = "WEDNESDAY";
  static private final String THURSDAY = "THURSDAY";
  static private final String FRIDAY = "FRIDAY";
  static private final String SATURDAY = "SATURDAY";
  static private final String SUNDAY = "SUNDAY";
  
  private static String getDayOfWeekName(int dayOfWeekValue) {
    switch (dayOfWeekValue) {
      case Calendar.MONDAY: return MONDAY;
      case Calendar.TUESDAY: return TUESDAY;
      case Calendar.WEDNESDAY: return WEDNESDAY;
      case Calendar.THURSDAY: return THURSDAY;
      case Calendar.FRIDAY: return FRIDAY;
      case Calendar.SATURDAY: return SATURDAY;
      case Calendar.SUNDAY: return SUNDAY;
    }
    return "INVALID";
  } 
  
  private static int getDayOfWeek(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month, day);
    calendar.setFirstDayOfWeek(Calendar.MONDAY);
    return calendar.get(Calendar.DAY_OF_WEEK);
  }
  
  public static void main(String[] args) {
    Scanner inputDate = new Scanner(System.in);
    int month = inputDate.nextInt() - 1;
    int day = inputDate.nextInt();
    int year = inputDate.nextInt();
    System.out.println(getDayOfWeekName(getDayOfWeek(year, month, day)));
  }
}
