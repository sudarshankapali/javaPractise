import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Execute program repeatedly using while loop
        while (true){
            // Take user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("==========================================");
            System.out.println("Enter your choice enter 'S' , 'P', or 'R'");
            char userInput = scanner.next().charAt(0);
            System.out.println("==========================================");
            //System.out.println("User Input is==> "+userInput);

            //Validation program of user input
            if(userInput == 'S'){
                System.out.println("User input is ==> Sissor:");
            } else if (userInput== 'P') {
                System.out.println("User input is ==> Paper:");
            } else if (userInput == 'R') {
                System.out.println("User input is ==> Rock:");
            }else {
                System.out.println("Invalid user input:");
            }


            //Generate computer input
            char[] availableOption = {'S', 'P', 'R'};
            Random computerInput = new Random();
            int output = computerInput.nextInt(3);
            //System.out.println("Computer input ==> " + availableOption[output]);

            //Output display part of computer
            if(availableOption[output] == 'S'){
                System.out.println("Computer input is ==> Sissor:");
            } else if (availableOption[output] == 'P') {
                System.out.println("Computer input is ==> Paper:");
            } else {
                System.out.println("Computer input is ==> Rock:");
            }
            System.out.println("==========================================");


            //Compare user and computer input and display result
            if(userInput == 'S' && availableOption[output] == 'P'){
                System.out.println("User wins");
            } else if (userInput == 'P' && availableOption[output] == 'R') {
                System.out.println("User wins");
            } else if (userInput == 'R' && availableOption[output] == 'S') {
                System.out.println("User wins");
            } else if (userInput == availableOption[output]) {
                System.out.println("Draw");
            } else {
                System.out.println("Computer wins");
            }
            System.out.println("==========================================");

            System.out.println("Do you want to paly again? If yes press 'Y' else press any key");
            char out = scanner.next().charAt(0);
            if (out == 'Y'){
                continue;
            }
            else {
                System.out.println("Game closing...");
                System.exit(0);
            }
        }
    }
}