import java.util.Scanner;
interface Data{
    double pi=3.142;
    double volume();
}
class Base{
    int rad;
    Base(int rad){
        this.rad = rad;
    }
    void show(){
        System.out.println("Base Radius of cylinder = "+rad);
    }
}
class CalVol extends Base implements Data{
    int ht;
    CalVol(int radius, int height){
        super(radius);
        ht = height;
    }
    public double volume(){
        return pi*ht*Math.pow(rad,2);
    }
    void show(){
        super.show();
        System.out.println("Height = "+ht);
        System.out.println("Volume  = "+volume());
    }
}
public class CS0801CS201090_A4_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        CalVol c1 = new CalVol(r,h);
        c1.show();
    }
}
