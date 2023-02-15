import java.util.Scanner;
public class Hello{
    public static void main(String[] arg){
        System.out.println("enter a number:");
        Scanner int1 = new Scanner(System.in);
        int num1 = int1.nextInt();
        System.out.println("enter second number:");
        Scanner int2 = new Scanner(System.in);
        int num2 = int2.nextInt();
        num2 =  num2*num1;
        System.out.println("result is : "+num2);
    }
}