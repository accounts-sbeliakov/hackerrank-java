import java.security.Permission;
import java.security.SecurityException;
import java.security.SecurityManager;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    DoNotTerminate.forbidExit();
    try {
      Scanner input = new Scanner(System.in);
      int inputNumber = input.nextInt();
      input.close();
      String stringFromNumber = Integer.toString(inputNumber);
      if (inputNumber == Integer.parseInt(stringFromNumber)) {
        System.out.println("Good job.");
      } else {
        System.out.println("Wrong answer.");
      }
    } catch (DoNotTerminate.ExitTrappedException e) {
      System.out.println("Unsuccessful Termination!!");
    }
  }
}


