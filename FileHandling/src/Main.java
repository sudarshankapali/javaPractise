import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("Sudarshan.txt");
        try{
            //this will create a new file
            file.createNewFile();

        }catch (IOException e){
            e.printStackTrace();;
            System.out.println("file not created");
        }

        //write something on this file
        try{
            FileWriter fileWriter = new FileWriter("Sudarshan.txt");
            fileWriter.write("hello my name is sudarshan kapali");
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println(e);
        }

        try{
            FileReader fileReader = new FileReader("Sudarshan.txt");
            int value;
            while((value = fileReader.read())!=-1){
                System.out.print((char)value);
            }
            fileReader.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        file.delete();
    }
}