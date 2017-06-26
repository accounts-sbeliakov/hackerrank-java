import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    for (int lineNumber = 1; input.hasNext(); lineNumber++) {
      String nextLine = "";
      nextLine = nextLine + lineNumber + " ";
      nextLine = nextLine + input.nextLine();
      System.out.println(nextLine);
    }
  }
}
