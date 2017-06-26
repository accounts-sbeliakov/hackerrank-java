import java.util.Scanner;

public class Solution {
  private static final int NUMBER_OF_ITERATIONS = 10;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inputNumber = scan.nextInt();
    for (int iterationNumber = 1; iterationNumber <= NUMBER_OF_ITERATIONS; iterationNumber++) {
      int resultOfMultiplication;
      resultOfMultiplication = inputNumber * iterationNumber;
      System.out.printf("%d x %d = %d\n", inputNumber, iterationNumber, resultOfMultiplication);
    } 
  }
}
