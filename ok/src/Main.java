import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream obj = new FileInputStream("hello.txt");
            System.out.println("bytes available "+obj.available());
            int i=obj.read();
            while (i != -1){
                System.out.print((char)i);
                i=obj.read();
            }
            obj.close();
        }
        catch (Exception e){

        }
    }
}