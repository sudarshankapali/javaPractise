import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("sudarshan.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("sudarshan.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        String nam = person1.getName();
        System.out.println(nam);
        int ag = person1.getAge();
        System.out.println(ag);
    }
}