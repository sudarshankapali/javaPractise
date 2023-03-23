public class Q4 {
    public void answer4(){
        int[] array={4,6,9,2,12,24,-1};
        int[] arranged;
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("max"+array[6]);
        System.out.println("min"+array[0]);
    }
}
