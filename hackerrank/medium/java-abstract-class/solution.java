import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // 1. Define the Locales for each required country
        Locale usLocale = Locale.US;
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;
        
        // 2. Initialize NumberFormat objects
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        DecimalFormatSymbols indiaSymbols = new DecimalFormatSymbols();
        indiaSymbols.setCurrencySymbol("Rs.");
        indiaSymbols.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) indiaFormat).setDecimalFormatSymbols(indiaSymbols);
        
        // 4. Format the numerical inputs into language strings
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        // 5. Output values matching requirements exactly
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
