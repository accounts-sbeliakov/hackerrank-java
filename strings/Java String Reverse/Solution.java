import java.lang.String;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Solution {
  
  private static String checkIfPolindrom(String inputString) {
    StringBuilder reversedString = new StringBuilder(inputString);
    if (inputString.equals(reversedString.reverse().toString()) == true) {
      return "Yes";
    } else {
      return "No";
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String stringToCheck = sc.next();
    System.out.println(checkIfPolindrom(stringToCheck));
  }
}
