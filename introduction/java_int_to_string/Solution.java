import java.util.Scanner;
import java.security.*; //dont know what exactly is used, cant check properly

public class Solution {
  public static void main(String[] args) {
    DoNotTerminate.forbidExit();
    try {
      Scanner input = new Scanner(System.in);
      int inputNumber = input.nextInt();
      input.close();
      String stringFromNumber = new String(Integer.toString(inputNumber));
      if (inputNumber == Integer.parseInt(stringFromNumber)) {
        System.out.println("Good job");
      } else {
        System.out.println("Wrong answer.");
      }
    } catch (DoNotTerminate.ExitTrappedException e) {
      System.out.println("Unsuccessful Termination!!");
    }
  }
}

class DoNotTerminate {
  public static class ExitTrappedException extends SecurityException {
    private static final long serialVersionUID = 1;
  }
  public static void forbidExit() {
    final SecurityManager securityManager = new SecurityManager() {
      @Override
      public void checkPermission(Permission permission) {
        if (permission.getName().contains("exitVM")) {
          throw new ExitTrappedException();
        }
      }
    };
    System.setSecurityManager(securityManager);
  }
}
