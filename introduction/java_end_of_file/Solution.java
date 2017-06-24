import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int stringNumber = 1;
    while (input.hasNext()) {
      String nextLine = new String("");
      nextLine = nextLine + stringNumber + " ";
      nextLine = nextLine + input.nextLine();
      System.out.println(nextLine);
      stringNumber++;
    }
  }
}
