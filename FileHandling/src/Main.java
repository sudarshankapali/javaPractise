import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Sudarshan.txt");

            //this will create a new file
            file.createNewFile();



        //write something on this file

            FileWriter fileWriter = new FileWriter("Sudarshan.txt");
            fileWriter.write("hello my name is sudarshan kapali");
            fileWriter.close();



            FileReader fileReader = new FileReader("Sudarshan.txt");
            int value;
            while((value = fileReader.read())!=-1){
                System.out.print((char)value);

        }
        file.delete();
    }
}