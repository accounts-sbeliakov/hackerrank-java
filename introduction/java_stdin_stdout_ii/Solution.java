import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inputInteger = scan.nextInt();
    double inputDouble = scan.nextDouble();
    scan.nextLine();
    String inputString = scan.nextLine();
    System.out.println("String: " + inputString);
    System.out.println("Double: " + inputDouble);
    System.out.println("Int: " + inputInteger);
  }
}
