import java.lang.String;
import java.util.Scanner;

public class Solution {
  
  private static String getSmallestSubstring(String inputLine, int length) {
    String smallest = inputLine.substring(0, length);
    for (int i = 0; i <= inputLine.length() - length; i++) {
      String substring = inputLine.substring(i, i + length);
      if (substring.compareTo(smallest) < 0) {
        smallest = substring;
      } 
    }       
    return smallest;
  }
  
  private static String getLargestSubstring(String inputWord, int length) {
    String largest = inputWord.substring(0, length);
    for (int i = 0; i <= inputWord.length() - length; i++) {
      String substring = inputWord.substring(i, i + length);
      if (substring.compareTo(largest) > 0) {
        largest = substring;
      }
    }       
    return largest;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.next();
    int susbtringLength = scan.nextInt();
    scan.close();
    System.out.println(getSmallestSubstring(line, susbtringLength));
    System.out.println(getLargestSubstring(line, susbtringLength));
  }
}
