public class Process1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("process 1 calling...");
        }
    }
}
