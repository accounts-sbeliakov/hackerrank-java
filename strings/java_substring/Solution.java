import java.util.Scanner;
import java.lang.String;

public class Solution {
  
  private static String findSubstring(String wordToCut, int startIndex, int endIndex) {
    return wordToCut.substring(startIndex, endIndex);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    System.out.println(findSubstring(word, start, end));
  }
}
