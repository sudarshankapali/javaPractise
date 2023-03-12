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
        //Person obj = new Person("sudarshan",22);
        //obj.introduce();
//        Triangle obj = new Triangle(3,4,5);
//        Average obj1 = new Average(2,2,2);
//        obj1.calculate();
//        Student obj2 = new Student();
//        obj2.name = "John";
//        obj2.roll_no = 2;
//        System.out.println("Name = "+obj2.name+" roll_no = "+obj2.roll_no);
        Rectangle obj = new Rectangle();
        obj.getArea();
        obj.getColor();
    }
}