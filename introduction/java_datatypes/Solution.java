import java.util.Scanner;

class Solution{
  public static void main(String []args)
  {
    Scanner input = new Scanner(System.in);
    int linesNumber = input.nextInt();
    for (int i = 0; i < linesNumber; i++) {
      try {
        long inputValue = input.nextLong();
        System.out.println(inputValue + " can be fitted in:");
        if (inputValue >= -128 && inputValue <= 127) System.out.println("* byte");
        if (inputValue >= -32768 && inputValue <= 32767) System.out.println("* short");
        if (inputValue >= -Math.pow(2, 31) && inputValue <= Math.pow(2, 31) - 1) System.out.println("* int");
        if (inputValue >= -Math.pow(2, 63) && inputValue <= Math.pow(2, 63) - 1) System.out.println("* long");
      }
      catch(Exception e) {
      System.out.println(input.next()+" can't be fitted anywhere.");
      }
    }
  }
}
