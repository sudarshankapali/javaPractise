import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int age = scanner.nextInt();
//        if (age == 40){
//            System.out.println("Age is 40");
//        }
//        else if(age==60){
//            System.out.printf("I will Retired");
//        }
//        else {
//            System.out.println("Age is neither 40 nor 60");
//        }
        switch (age){
            case 40:
                System.out.printf("Age is 40");
                break;
            case 60:
                System.out.printf("I will retire");
                break;
            default:
                System.out.printf("Ypur age is neither 40 nor 60");
                break;
        }
    }
}