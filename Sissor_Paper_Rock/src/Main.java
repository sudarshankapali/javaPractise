import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice enter 'S' , 'P', or 'R'");
        char userInput = scanner.next().charAt(0);
        System.out.println("User Input is==> "+userInput);

        //Generate computer input
        char[] availableOption = {'S', 'P', 'R'};
        Random computerInput = new Random();
        int output = computerInput.nextInt(3);
        System.out.println("Computer input ==> " + availableOption[output]);



        //Compare user and computer input and display result
        if(userInput == 'S' && availableOption[output] == 'P'){
            System.out.println("User wins");
        } else if (userInput == 'P' && availableOption[output] == 'R') {
            System.out.println("User wins");
        } else if (userInput == 'R' && availableOption[output] == 'S') {
            System.out.println("User wins");
        }
        else {
            System.out.println("Computer wins");
        }
    }
}