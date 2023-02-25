import java.util.Scanner;
public class Method{
    private int add(int a, int b){
            Scanner scanner = new Scanner(System.in);
            int sum = a + b;
            return sum;
        }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        Method obj = new Method();
        int result = obj.add(a,b);
        System.out.println("Sum is "+result);
    }
}