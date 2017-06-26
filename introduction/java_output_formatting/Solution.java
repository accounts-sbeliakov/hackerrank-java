import java.lang.StringBuilder;
import java.util.Scanner;

public class Solution {
  static private final int REQUIRED_LENGTH = 15;
  static private final int MAX_ONE_DIGIT_NUMBER = 9; 
  static private final int MAX_TWO_DIGITS_NUMBER = 99;
  static private final String ONE_DIGIT_NUMBER_PREFIX = "00";
  static private final String TWO_DIGITS_NUMBER_PREFIX = "0";
  static private final int STRINGQUANTITY = 3; 
  static private final int VERTICALSEPARATORLENGTH = 32;
  
  public static String formatOutput(String line, String numberPrefix, int number) {
    StringBuilder result = new StringBuilder(line);
    for (int j = 0; j < REQUIRED_LENGTH - line.length(); j++) {
      result.append(" ");
    }
    result.append(numberPrefix);
    result.append(Integer.toString(number));
    result.append("\n");
    String resultToString = result.toString();
    return resultToString;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String verticalSeparator = new String(new char[VERTICALSEPARATORLENGTH]).replace('\0', '=');
    System.out.println(verticalSeparator);
    for (int i = 0; i < STRINGQUANTITY; i++) {
      String inputString = scan.next();
      int inputNumber = scan.nextInt();
      if (inputNumber <= MAX_ONE_DIGIT_NUMBER) {
        System.out.printf(formatOutput(inputString, ONE_DIGIT_NUMBER_PREFIX, inputNumber));
      } else if (inputNumber <= MAX_TWO_DIGITS_NUMBER) {
        System.out.printf(formatOutput(inputString, TWO_DIGITS_NUMBER_PREFIX, inputNumber));
      }
      else {
        System.out.printf(formatOutput(inputString, "", inputNumber));
      }
    }
    System.out.println(verticalSeparator);
  }
}
