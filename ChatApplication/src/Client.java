import java.io.*;
import java.net.Socket;

public class Client {
    public static void main (String[] args){
        try {
            Socket socket = new Socket("127.0.0.1",12300);//127.0.0.1->localhost
            //this is for getting socket value
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //i need a pen to write the message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String  sendingMessage, receivingMesssage;
            while(true){
                //receiving message from client
                receivingMesssage = socketDataReader.readLine();
                System.out.println("Server: "+receivingMesssage);

                //sending to client
                sendingMessage = userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
