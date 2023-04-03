import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main{
    public static void main(String[] args) {
        try{
            //use text area
//        File file = new File("SudarshanKapali");
//            file.createFile();

            FileWriter fileWriter = new FileWriter("sudarshan.txt");
            fileWriter.write("1\n");
            fileWriter.write("2\n");
            fileWriter.write("3\n");
            fileWriter.close();

        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            //read
            FileReader fileReader = new FileReader("sudarshan.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
//            System.out.println(line);
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (Exception e){

        }
    }
}