class Student{
    private String name;
    private int age;
    private char sex;
    void inpdetails(String name,int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    void show(){
        System.out.println("Name of Student: "+name);
        System.out.println("age: "+age);
        System.out.println("sex: "+sex);
    }
}
class Marks extends Student{
    int regnum;
    int marks;
    String subject;
    void inpdetails(String name,int age, char sex,int regnum,String subject,int marks){
        super.inpdetails(name,age,sex);
        this.regnum=regnum;
        this.marks = marks;
        this.subject=subject;
    }
    void show(){
        super.show();
        System.out.println("Registration Number:"+regnum);
        System.out.println("Subject: "+subject);
        System.out.println("Marks Obtained: "+marks);
    }
}
public class CS0801CS201090_A3_Q6{
    public static void main(String[] args) {
        Marks Sidharth = new Marks();
        Sidharth.inpdetails("Sidharth Jain",19,'M',201090,"OOPs",80);
        Sidharth.show();
    }
}
