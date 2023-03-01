public class Triangle {
    int length ,breadth,height;
    Triangle(int l, int b,int h){
        int area = (int) (0.5 * b * h);
        int perimeter = l*b*h;
        System.out.println("area = "+area+" perimeter = "+perimeter);
    }
}
