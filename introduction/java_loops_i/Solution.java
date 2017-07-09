import java.util.Scanner;

public class Solution {
  private static final int NUMBER_OF_ITERATIONS = 10;
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int inputNumber = scan.nextInt();
    for (int iteration = 1; iteration <= NUMBER_OF_ITERATIONS; iteration++) {
      int resultOfMultiplication = inputNumber * iteration;
      System.out.println(inputNumber + " x " + iteration + " = " + resultOfMultiplication);
    } 
  }
}
