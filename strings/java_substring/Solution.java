import java.lang.String;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String line = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    System.out.println(line.substring(start, end));
  }
}
