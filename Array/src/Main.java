public class Main {
    public static void main(String[] args) {
        /*int[] x = new int[5];
        int[] y = {10,20,30};
        System.out.println("y value(address) ==> "+y);
        System.out.println("x value(address) ==> "+x);
        System.out.println("index 0 value of y ==> "+y[0]);
        System.out.println("index 0 value of x(garbage value) ==>"+x[0]);
        System.out.println("all value of array of y");
        for(int output:y){
            System.out.println(output);
        }*/
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; x[i] <= x.length;i++ )
            System.out.println(x[i]);
    }
}