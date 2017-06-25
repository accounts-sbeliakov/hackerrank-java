import java.util.Scanner;

public class Solution {
  static private final int MAX_NUMBER_OPERATIONS = 10;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputNumber = input.nextInt();
    int result;
    for (int i = 1; i <= MAX_NUMBER_OPERATIONS; i++) {
      result = inputNumber * i;
      System.out.printf("%d x %d = %d\n", inputNumber, i, result);
    } 
  }
}
