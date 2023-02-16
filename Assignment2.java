import java.util.Scanner;
public class Assignment2{
    public static void main(String[] arg){

        System.out.println("What is the total number of employees?: \n");
        Scanner employeesNum = new Scanner(System.in);
        int employeesNum1 = employeesNum.nextInt();
        System.out.println("\nWhat is the name of the supervisor?: \n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println("\nHow many times nuclear waste is reomved from the core: \n");
        Scanner waste = new Scanner(System.in);
        int newclearWaste = waste.nextInt();
        System.out.println("\nWhat is the total weight of the waste?: \n");
        Scanner supervisorName = new Scanner(System.in);
        float supervisor = supervisorName.nextFloat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIs the electric motor beign replaced every 18 days? select 'y' for yes and 'n' for no: \n");
        char c = scanner.next().charAt(0);
        System.out.println("\n\n\n\tUpdate on Nuclear Reactor name: JX00-XC-HB1\n\t Location: East of Japan\n\n");
        System.out.println("The total number of employees are: "+employeesNum1);
        System.out.println("The name of the supervisor is : "+name);
        System.out.println("The total number of tiems neculear waste removed is  "+newclearWaste +" times");
        System.out.println("The weight of the waste is : "+supervisor);
        if(c == 'y' || c == 'Y'){
            System.out.println("You have entered: "+c);
        }
        else if (c == 'n' || c == 'N'){
            System.out.println("You have entered: "+c);
        }
        else{
            System.out.println("Invalid input:");
        }
        
    }
}