public class Main {
    public static void display(int a ){
        System.out.println("arguments are: "+a);
    }
    public static void display(){
        System.out.println("no arguments passed:");
    }
    public static void main(String[] args) {
//        Shape obj = new Shape(200,300);
//        System.out.println("width is : "+obj.width);
//        System.out.println("heigth is : "+obj.heigth);
//        obj.turnOn();
//        obj.condition();
//        obj.turnOff();
//        obj.condition();
//        obj.area();
//        Main.display(5);
//        Main.display();
        Person obj = new Person("sudarshan",22);
        obj.introduce();
    }
}