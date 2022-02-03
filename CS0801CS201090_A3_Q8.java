class Plane{
    int x1,y1;
    Plane(int nx,int ny){         
        x1 = nx;
        y1 = ny;
    }
    void show(){
        System.out.println("Info from class Plane-->");
        System.out.println("    x1 = "+x1);
        System.out.println("    y1 = "+y1);
    }
}
class Circle extends Plane{
    int x2,y2;
    double radius, area;
    Circle(int nx,int ny,int nx2, int ny2){
        super(nx,ny);
        x2 = nx2;
        y2 = ny2;
    }
    void findRadius(){
        radius = (Math.pow(Math.pow((x1-x2),2) + Math.pow((y1-y2),2), 0.5))/2;
        System.out.println("Radius of the circle = "+radius);
    }
    void findArea(){
        area = Math.PI*Math.pow(radius,2);
        System.out.println("Area of the circle = "+area);
    }
    void show(){
        super.show();
        System.out.println("Info from class Circle-->");
        System.out.println("    x2 = "+x2);
        System.out.println("    y2 = "+y2);
        System.out.println("    Radius of the Circle = "+radius);
        System.out.println("    Area of the Circle = "+area);
    }
}
public class CS0801CS201090_A3_Q8{
    public static void main(String[] args) {
        Circle c1 = new Circle(2,4,8,11);
        c1.findRadius();
        c1.findArea();
        c1.show();
    }
}
