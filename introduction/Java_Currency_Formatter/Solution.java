import java.util.Locale;
import java.util.Locale.Builder;
import java.text.NumberFormat;
import java.util.Scanner;

public class Solution {
  
  public static final Locale localIndia = new Locale("en", "IN"); 
  
  private static String getCurrency(Locale currency, double priceToConvert) {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(currency);
    String paymentInTheProvidedCurrency = numberFormat.format(priceToConvert);
    return paymentInTheProvidedCurrency;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();   
    System.out.println("US: " + getCurrency(Locale.US, payment));
    System.out.println("India: " + getCurrency(localIndia, payment));
    System.out.println("China: " + getCurrency(Locale.CHINA, payment));
    System.out.println("France: " + getCurrency(Locale.FRANCE, payment));
  }
}
