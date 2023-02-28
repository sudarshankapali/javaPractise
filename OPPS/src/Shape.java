public class Shape {
    public int width;
    public int heigth;
    boolean isGameOver;
    Shape(int w , int h){
        width = w;
        heigth = h;
    }
    public void turnOn(){
        isGameOver = true;
    }
    public void turnOff(){
        isGameOver = false;
    }
    public void condition(){
        System.out.println("GAME IS OVER?"+isGameOver);
    }
    public void area(){
        int result = width*heigth;
        System.out.println(result);
    }
}
