import java.util.Scanner;
import java.lang.String;

public class Solution {
  
  private static String getSmallestSubstring(String inputWord, int length) {
    String smallest = inputWord.substring(0, length);
    for (int i = 0; i <= inputWord.length() - length; i++) {
      String substring = inputWord.substring(i, i + length);
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
    String word = scan.next();
    int susbtringLength = scan.nextInt();
    scan.close();
    System.out.println(getSmallestSubstring(word, susbtringLength));
     System.out.println(getLargestSubstring(word, susbtringLength));
  }
}
