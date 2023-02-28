public class Main {
    public static void main(String[] args) {
        Shape obj = new Shape(200,300);
        System.out.println("width is : "+obj.width);
        System.out.println("heigth is : "+obj.heigth);
        obj.turnOn();
        obj.condition();
        obj.turnOff();
        obj.condition();
        obj.area();
    }
}