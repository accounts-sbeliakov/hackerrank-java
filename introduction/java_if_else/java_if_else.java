import java.util.Scanner;

public class Solution {
  private static String isWeird(int numberToCheck) {
    String answer = new String();
    if ((numberToCheck % 2 == 1) && (numberToCheck <= 100) && (numberToCheck >= 1)) {
      answer = "Weird"; 
    } else {
        if((numberToCheck >= 2) && (numberToCheck <= 5)) { 
          answer = "Not Weird"; 
        }
        if((numberToCheck >= 6) && (numberToCheck <= 20)) { 
          answer = "Weird"; 
        }
        if((numberToCheck > 20) && (numberToCheck <= 100)) { 
          answer = "Not Weird"; 
        }
      } 
  return answer;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputNumber = input.nextInt();            
    System.out.println(isWeird(inputNumber));       
  }
}
