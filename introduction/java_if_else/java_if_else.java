import java.util.Scanner;

public class Solution {
  
  private static final String WEIRD = "Weird";
  private static final String NOT_WEIRD = "Not Weird";
  
  private static String isWeird(int numberToCheck) {
    if ((numberToCheck % 2 == 1) && (numberToCheck <= 100) && (numberToCheck >= 1)) {
      return WEIRD; 
    } else if((numberToCheck >= 2) && (numberToCheck <= 5)) { 
        return NOT_WEIRD; 
    } else if((numberToCheck >= 6) && (numberToCheck <= 20)) { 
        return WEIRD; 
    } else if((numberToCheck > 20) && (numberToCheck <= 100)) { 
        return NOT_WEIRD; 
    }
    return NOT_WEIRD;
  } 
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputNumber = input.nextInt();            
    System.out.println(isWeird(inputNumber));       
  }
}
