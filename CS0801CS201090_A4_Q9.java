import java.util.Scanner;
interface Shape{
    double area();
}
class Circle implements Shape{
    double radius;
    Circle(int r){
        radius = r;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
class Rectangle implements Shape{
    double length,breadth;
    Rectangle(int l,int b){
        this.length =l;
        this.breadth = b;
    }
    public double area(){
        return length*breadth;
    }
}
public class CS0801CS201090_A4_Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius ");
        int rad = s.nextInt();
        Circle c = new Circle(rad);
        System.out.print("Enter length and breadth ");
        int l = s.nextInt();
        int b = s.nextInt();
        Rectangle r = new Rectangle(l,b);
        System.out.println("Area of circle is = "+c.area());
        System.out.println("Area of rectangle is = "+r.area());
    }
}