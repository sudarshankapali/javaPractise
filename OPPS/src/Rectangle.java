public class Rectangle implements Shape1,AnotherShape{
    @Override
    public void getArea() {
        System.out.println("hello world this function is being called from the rectangle class");
    }

    @Override
    public void getColor() {
        System.out.println("printing color");
    }
}
