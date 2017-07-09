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
    int numberOfTests = in.nextInt();
    in.nextLine();
    for (int i = 0; i < numberOfTests; i++) {
      String pattern = in.nextLine();
      System.out.println(isValidRegex(pattern) ? VALID : INVALID);
    }
  }
}
