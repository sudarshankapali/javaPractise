package CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    Scanner scanner = new Scanner(System.in);
    float nepaliCurrency;
    float usdCurrency;
    public void takeInput(){
        System.out.println("Enter your nepali Currency in rs:");
        nepaliCurrency = scanner.nextFloat();
    }

    public void convert(){
       float usdCurrency1 = (float) (nepaliCurrency / 135.03);
        System.out.println("Your nepali currenct rs: "+nepaliCurrency+ "can be converted into USD: "+usdCurrency1+ "$");
    }
}
