import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
  
  private static final String VALID = "Valid";
  private static final String INVALID = "Invalid";
  
  private static boolean isValidRegex(String pattern) {
    try {
      Pattern.compile(pattern);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberOfTests = Integer.parseInt(in.nextLine());
    while (numberOfTests > 0) {
      String pattern = in.nextLine();
      System.out.println(isValidRegex(pattern) ? VALID : INVALID);
    }
  }
}
