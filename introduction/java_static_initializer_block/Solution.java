import java.util.Scanner;

public class Solution {
  private static boolean flag = true; 
  private static int breadth;
  private static int height;
	
  static { 
    Scanner input = new Scanner(System.in); 
    breadth = input.nextInt();
    height = input.nextInt();
    if ((breadth <= 0) || (height <= 0)) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
      flag = false;
    }
  }
	
  public static void main(String[] args){
    if (flag) {
      int area = breadth * height;
      System.out.print(area);
    }
  }
}
