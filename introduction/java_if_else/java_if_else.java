import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputNumber = input.nextInt();            
    String output = "";
    if ( (inputNumber % 2 == 1) && (inputNumber <= 100) && (inputNumber >= 1) ) { output = "Weird"; }
    else {
      if( (inputNumber >= 2) && (inputNumber <= 5) ) { output = "Not Weird"; }
      if( (inputNumber >= 6) && (inputNumber <= 20) ){ output = "Weird"; }
      if( (inputNumber > 20) && (inputNumber <= 100) ) { output = "Not Weird"; }
    }
    System.out.println(output);       
  }
}
