package Fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    int userInput;
    public void fibo(){
        System.out.println("Enter a number of terms to print:");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();

        fiboSeries(userInput);
        scanner.close();

    }
    public void fiboSeries(int i){
        int a=0;
        int b=1;
        int c=0;

        if(userInput == 1){
            System.out.println(a);
        } else if (userInput == 0) {
            System.out.println("invalid input");
        }else {
            System.out.println(a);
            System.out.println(b);
            while(i-2!=0){
                c = a + b;
                a=b;
                b=c;
                i--;
                System.out.println(c);
            }
        }
    }
}
