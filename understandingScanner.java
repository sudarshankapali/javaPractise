import java.util.Scanner;

public class understandingScanner{
    public static void main(String[] arg){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();    
        int result;
        result = num * 50;
        System.out.println("Result is : "+result);
    }
}