public class Main {
    public static void main(String[] args) {
        int[] x = {10,20,30};
        int [][] y  = {{10,20,30,40},
                {20,90,80},
                {50,30,40}};

        //this is for 1d array

        //this is for 2d array
        for(int i=0; i< y.length;i++){

            for (int j=0;j< y[i].length;j++){
                System.out.println(y[i][j]);
            }

        }
    }
}