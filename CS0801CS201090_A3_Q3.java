class Prism{
    private double l=0,w=0,h=0;
    public void setprism(double l,double w, double h) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    public double topArea(){
        return l*w;
    }
    public  double bottomArea(){
        return l*w;
    }
    public double leftArea(){
        return h*w;
    }
    public  double rightArea(){
        return h*w;
    }
    public double frontArea(){
        return l*h;
    }
    public  double backArea(){
        return l*h;
    }
    public  double area(){
        return 2*(l*w+h*w+h*l);
    }

}
public class CS0801CS201090_A3_Q3 {
    public static void main(String[] args) {
        Prism p1 = new Prism();
        p1.setprism(6,8,10);
        System.out.println("Top Area -> "+ p1.topArea());
        System.out.println("Bottom Area -> "+ p1.bottomArea());
        System.out.println("Left Area -> "+ p1.leftArea());
        System.out.println("Right Area -> "+ p1.rightArea());
        System.out.println("Front Area -> "+ p1.frontArea());
        System.out.println("Back Area -> "+ p1.backArea());
        System.out.println("Total Area -> "+ p1.area());
    }
}
