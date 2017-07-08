import java.lang.String;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Solution {
  
  private static boolean isPolindrom(String input) {
    String reversed = new StringBuilder(input).reverse().toString();
    return input.equals(reversed);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String stringToCheck = sc.next();
    if (isPolindrom(stringToCheck)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    } 
  }
}
