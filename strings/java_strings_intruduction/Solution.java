import java.lang.String;
import java.util.Scanner;

public class Solution {
  
  private static int totalLength(String firstStringToSum, String secondStringToSum) {
    return firstStringToSum.length() + secondStringToSum.length();
  }
  
  private static String isLess (String first, String second) {
    if (first.compareTo(second) > 0) {
      return "Yes";
    } else {
        return "No";
      }
  }
  
  private static String capitalizeLine(String line) {
    String firstLetter = line.substring(0, 1).toUpperCase();
    String restOfTheLine = line.substring(1, line.length()); 
    return firstLetter + restOfTheLine; 
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String first = scan.next();
    String second = scan.next();
    System.out.println(totalLength(first, second));
    System.out.println(isLess(first, second));
    System.out.println(capitalizeLine(first) + " " + capitalizeLine(second));
  }
}
