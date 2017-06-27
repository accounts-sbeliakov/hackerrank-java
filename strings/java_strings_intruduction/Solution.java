import java.util.Scanner;
import java.lang.String;

public class Solution {
  
  private static int lengthSum(String firstStringToSum, String secondStringToSum) {
    return (firstStringToSum.length() + secondStringToSum.length());
  }
  
  private static String compareStringLexicographically(String firstStringToCompare, String secondStringToCompare) {
    if (firstStringToCompare.compareTo(secondStringToCompare) > 0) {
      return "Yes";
    } else {
        return "No";
      }
  }
  
  private static String capitalizeFirstLetter(String firstStringToCapitalize, String secondStringToCapitalize) {
    String capitalizeFirstLetterFirstString = firstStringToCapitalize.substring(0, 1).toUpperCase();
    String notChangedPartOfFirstString = firstStringToCapitalize.substring(1, firstStringToCapitalize.length()); 
    String changeOfFirstString = capitalizeFirstLetterFirstString + notChangedPartOfFirstString;
    String capitalizeFirstLetterSecondString = secondStringToCapitalize.substring(0, 1).toUpperCase();
    String notChangedPartOfSecondString = secondStringToCapitalize.substring(1, secondStringToCapitalize.length()); 
    String changeOfSecondString = capitalizeFirstLetterSecondString + notChangedPartOfSecondString;
    return (changeOfFirstString + " " + changeOfSecondString);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstString = scan.next();
    String secondString = scan.next();
    System.out.println(lengthSum(firstString, secondString));
    System.out.println(compareStringLexicographically(firstString, secondString));
    System.out.println(capitalizeFirstLetter(firstString, secondString));
  }
}
