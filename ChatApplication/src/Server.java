import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12300);
            Socket socket = serverSocket.accept();
            System.out.println("connected");

//            InputStream inputStream = socket.getInputStream();
//            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

            //this is for getting socket value
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //i need a pen to write the message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String  sendingMessage, receivingMesssage;
            while(true){
                //sending to client
                sendingMessage = userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();

                //receiving message from client
                receivingMesssage = socketDataReader.readLine();
                System.out.println("Client: "+receivingMesssage);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}