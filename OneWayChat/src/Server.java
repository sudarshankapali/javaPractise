import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            ServerSocket serverSocket = new ServerSocket(1000);
            Socket socket = serverSocket.accept();
            System.out.println("connection established");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            while(true){
                System.out.println("enter a string");
                String sr = input.nextLine();
                printWriter.println(sr);
            }

//            socket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}