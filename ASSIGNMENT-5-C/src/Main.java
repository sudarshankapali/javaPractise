import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("assignment.txt");
        file.createNewFile();
        String fileName = "assignment.txt";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Object obj = ois.readObject();
                if (obj == null) {
                    break;
                }
                System.out.println("Deserialized object: " + obj.toString());
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
