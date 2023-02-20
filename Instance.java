import java.util.Scanner;

public class Instance{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        boolean check;
        System.out.println("Enter any words or number: ");
        String Input = scanner.nextLine();
        check = Input instanceof String;
        if (check == true){
            System.out.println("The entered inputs are String:");
        }
        else{
            System.out.println("The entered inputs are not String:");
        }
    }
}