public class Person {
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
    void introduce(){
        System.out.println("name = "+name+ " age = "+age);
    }
}
