import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInputReader =  new BufferedReader(new InputStreamReader(System.in));

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String r,s;
            while(true){
                r = socketDataReader.readLine();
                System.out.println("Cliemt: "+r);

                s = userInputReader.readLine();
                printWriter.println(s);
                printWriter.flush();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}