class Workers{
    String name;
    double basic;
    Workers(String name,double basic){
        this.name = name;
        this.basic = basic;
    }
    void display(){
        System.out.println("Info from Class Workers->");
        System.out.println("    Name : "+ name);
        System.out.println("    Basic Pay :"+ basic);
    }
}
class Wages extends Workers{
    double rate;
    double hrs;
    double wage;
    Wages(String name,double basic, double rate){
        super(name,basic);
        this.rate = rate;
        wage = basic;
    }
    double overtime(double hrs){
        this.hrs = hrs;
        return hrs*rate;
    }
    void display(){
        super.display();
        System.out.println("Info from Class Wages-->");
        System.out.println("    Rate per hour : "+ rate);
        System.out.println("    Extra hours : "+ hrs);
        System.out.println("    Total wages (Basic + overtime) :" + (basic + hrs*rate));
    }
}
public class CS0801CS201090_A3_Q7{
    public static void main(String[] args) {
        Wages a1 = new Wages("Sidharth", 25450, 1250);
        System.out.println("Overtime amount : "+a1.overtime(3));
        a1.display();
    }
}
