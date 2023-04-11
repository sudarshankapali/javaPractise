public class Process1 extends Thread{
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("process has been executed");
        }
    }
}
