import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        int a=0;
        int b=1,c;
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}