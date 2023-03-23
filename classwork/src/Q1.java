import java.util.Scanner;

public class Q1 {
    public void answer1(){
        int count=0;

        //take input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int userInput = scanner.nextInt();

//        check if prime number
        for(int i=1;i<=(userInput/2);i++){
            if(userInput%i == 0){
                count++;
            }
        }

//        print output
        if(count==1){
            System.out.println("prime number");
        }
        else {
            System.out.println("composite number");
        }
        scanner.close();
    }
}
