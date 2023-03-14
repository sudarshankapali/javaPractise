package MultiplicationTable;

import java.util.Scanner;

public class Multiply {
    public static void multiplyTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        System.out.println("Multiplication table of "+userInput+ " is:");
        for(int i=1;i<=10;i++){
            int result = userInput * i;
            System.out.println(userInput+ " * "+i+ " = "+result);
        }
        scanner.close();
    }
}
