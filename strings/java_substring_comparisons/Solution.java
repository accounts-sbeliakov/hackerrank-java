import java.util.Scanner;
import java.lang.String;

public class Solution {
  
  public static String getSmallestAndLargest(String inputWord, int coefficient) {
    String smallest = inputWord.substring(0, coefficient);
    String largest = inputWord.substring(0, coefficient);
    for (int i = 0; i <= inputWord.length() - coefficient; i++) {
      if (inputWord.substring(i, i + coefficient).compareTo(smallest) < 0) {
        smallest = inputWord.substring(i, i + coefficient);
      } 
      if (inputWord.substring(i, i + coefficient).compareTo(largest) > 0) {
        largest = inputWord.substring(i, i + coefficient);
      }
    }       
    return smallest + "\n" + largest;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    int susbtringLength = scan.nextInt();
    scan.close();
    System.out.println(getSmallestAndLargest(word, susbtringLength));
  }
}
