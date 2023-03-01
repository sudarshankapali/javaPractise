public class Average {
    int a,b,c;
    Average(int i,int j, int k){
       a=i;
       b=j;
       c=k;
    }
    void calculate(){
        float result = (a+b+c)/3;
        System.out.println("average = "+result);
    }
    
}
