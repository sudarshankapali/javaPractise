public class Pattern3 {
    public void printArea(){
        for(int i=100;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println(i);
        }
    }
}
