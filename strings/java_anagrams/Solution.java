import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  static boolean isAnagram(String first, String second) {
    char[] firstArr = first.toLowerCase().toCharArray();
    char[] secondArr = second.toLowerCase().toCharArray();
    Arrays.sort(firstArr);
    Arrays.sort(secondArr);
    return Arrays.equals(firstArr, secondArr);
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String first = scan.next();
    String second = scan.next();
    scan.close();
    boolean output = isAnagram(first, second);
    System.out.println( (output) ? "Anagrams" : "Not Anagrams" );
  }
}
