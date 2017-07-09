import java.lang.StringBuilder;
import java.util.Scanner;

public class Solution {
  static private final int REQUIRED_LENGTH = 15;
  static private final int MAX_ONE_DIGIT_NUMBER = 9; 
  static private final int MAX_TWO_DIGITS_NUMBER = 99;
  static private final String ONE_DIGIT_NUMBER_PREFIX = "00";
  static private final String TWO_DIGITS_NUMBER_PREFIX = "0";
  static private final int NUMBER_OF_INPUTS = 3; 
  static private final int VERTICAL_SEPARATOR_LENGTH = 32;
  
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

  public static String resultOutput(String inputStringValue, int inputNumberValue) {
    if (inputNumberValue <= MAX_ONE_DIGIT_NUMBER) {
        return formatOutput(inputStringValue, ONE_DIGIT_NUMBER_PREFIX, inputNumberValue);
      } else if (inputNumberValue <= MAX_TWO_DIGITS_NUMBER) {
        return formatOutput(inputStringValue, TWO_DIGITS_NUMBER_PREFIX, inputNumberValue);
      } else {
        return formatOutput(inputStringValue, "", inputNumberValue);
      }
  }
    
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String verticalSeparator = new String(new char[VERTICAL_SEPARATOR_LENGTH]).replace('\0', '=');
    System.out.println(verticalSeparator);
    for (int i = 0; i < NUMBER_OF_INPUTS; i++) {
      String inputString = scan.next();
      int inputNumber = scan.nextInt();
      System.out.printf(resultOutput(inputString, inputNumber));
    }
    System.out.println(verticalSeparator);
  }
}
