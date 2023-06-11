import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("127.0.0.1",12345);
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String r,s;
            while(true){
                s = userInputReader.readLine();
                printWriter.println(s);
                r = socketDataReader.readLine();
                System.out.println("Server: "+r);
            }
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
