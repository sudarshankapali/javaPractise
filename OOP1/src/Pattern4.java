public class Pattern4 {
    public void printArea(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=4;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
