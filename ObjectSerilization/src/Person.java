import java.io.Serializable;

public class Person implements Serializable {
    public int age = 21;
    String name = "Sudarshan kapali";
    double height = 5.7;
    public  String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }
}
