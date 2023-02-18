import java.util.Scanner;
public class Test{
    public static void main(String[] arg){
        boolean flag;

        //Making object of scanner
        Scanner scanner = new Scanner(System.in);

        //Input output program
        System.out.println("Enter a character 'y' or 'n' ");
        char choice = scanner.next().charAt(0);

        //Condition program to set falg value using boolean datatype
        if(choice == 'y'){
            flag = true;
        }
        else{
            flag = false;
        }

        //Output
        System.out.println("Your choice is: " +flag);
    }
}