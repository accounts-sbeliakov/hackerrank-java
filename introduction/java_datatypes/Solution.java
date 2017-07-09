import java.util.Scanner;

class Solution {
 
  private static void dataType(long valueToCheckType) {
    System.out.println(valueToCheckType + " can be fitted in:");
        if ((valueToCheckType >= -128) && (valueToCheckType <= 127)) System.out.println("* byte");
        if ((valueToCheckType >= -32768) && (valueToCheckType <= 32767)) System.out.println("* short");
        if ((valueToCheckType >= -Math.pow(2, 31)) && (valueToCheckType <= Math.pow(2, 31) - 1)) System.out.println("* int");
        if ((valueToCheckType >= -Math.pow(2, 63)) && (valueToCheckType <= Math.pow(2, 63) - 1)) System.out.println("* long");
  }
  
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);
    int numberOfInputs = input.nextInt();
    for (int i = 0; i < numberOfInputs; i++) {
      try {
        long inputValue = input.nextLong();
        dataType(inputValue);
      } catch(Exception e) {
        System.out.println(input.next()+" can't be fitted anywhere.");
        }
    }
  }
}
