public class Pattern2 {
    public void getArea(){
        for(int i=1;i<=100;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println(i);
        }
    }
}
