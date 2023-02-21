import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int money = 1;
        int i=1;
        //System.out.println("Hello world!");
        /*for(int i = 1; i <= 10; i++){
            System.out.println("hello world: "+i);
            money  i;
        }*/
        while(i!=10){
            money *= i;
            i++;
        }
        System.out.println(money);
    }
}