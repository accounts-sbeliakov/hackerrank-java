import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

  private static final String SEPARATOR_REGEX = "[ !,?._'@]+";
  
  private static List<String> getTokens(String line) {
    List<String> tokens = new ArrayList<>();
    for (String token : line.split(SEPARATOR_REGEX)) {
      if (!token.isEmpty()) {
        tokens.add(token);
      } 
    }
    return tokens;
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    List<String> tokens = getTokens(s);
    System.out.println(tokens.size());
    for (String token : tokens) {
      System.out.println(token);
    }
    scan.close();
  }
}
