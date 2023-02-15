import java.util.Scanner;
public class Assignment2{
    public static void main(String[] arg){

        System.out.println("What is the total number of employees?: \n");
        Scanner employeesNum = new Scanner(System.in);
        int employeesNum1 = employeesNum.nextInt();
        System.out.println("What is the name of the supervisor?: \n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println("how many times nuclear waste is reomved from the core: \n");
        Scanner waste = new Scanner(System.in);
        int newclearWaste = waste.nextInt();
        System.out.println("What is the total weight of the waste?: \n");
        Scanner supervisorName = new Scanner(System.in);
        float supervisor = supervisorName.nextFloat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the electric motor beign replaced every 18 days?: \n");
        char c = scanner.next().charAt(0);
        System.out.println("You have entered: "+c);
    }
}