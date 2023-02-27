import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i=1,chances;
        boolean isGameOver = false;
        
        //Taking input from user
        System.out.println("Enter your guess");
        int userInput = scanner.nextInt();
        //System.out.println("User Input ==> "+userInput);

        //generate random input for computer side
        Random generateRandomNumber = new Random();
        int computerInput =generateRandomNumber.nextInt(11);
        //System.out.println("Computer input ==> "+computerInput);


        //compare input using loop
        while(true){
            while(!isGameOver && i < 5){
            chances = 5;
            if(userInput == computerInput){
                System.out.println("You guessed correct number: ");
                System.out.println("================================");
                isGameOver = true;
            }else if(userInput > computerInput){
                chances -= i;
                System.out.println("--------------------------------");
                System.out.println(userInput+" is too high. Guess a lower number");
                System.out.println("Enter your guess again. You have "+chances+" guess left");
                int newInput = scanner.nextInt();
                userInput = newInput;
                isGameOver = false;
            }else{
                chances -= i;
                System.out.println("--------------------------------");
                System.out.println(userInput+" is too low. Guess a higher number");
                System.out.println("Enter your guess again You have "+chances+" guess left");
                int newInput1 = scanner.nextInt();
                userInput = newInput1;
                isGameOver = false;
            }
            i++;
        }
        if(i >= 5){
                System.out.println("================================");
                System.out.println("YOU LOST!!!");
                System.out.println("================================");
            }else{
                System.out.println("YOU WIN");
                System.out.println("================================");
            }
            System.out.println("Do you want to play agani?. If yes press 'Y' or 'y' else press any key");
            scanner.nextLine();
            char playAgain = scanner.next().charAt(0);
            if(playAgain == 'y' || playAgain == 'Y'){
                System.out.println("Loading new game...");
                i=1;
                isGameOver = false;
                System.out.println("================================");
                System.out.println("Enter your guess");
                int newInput1 = scanner.nextInt();
                userInput = newInput1;
                Random generateRandomNumber1 = new Random();
                computerInput = generateRandomNumber1.nextInt(11);
            }
            else{
                System.out.println("Closing Game...");
                System.exit(0);
            }
        }
    }
}