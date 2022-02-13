import java.util.Scanner;
class Revstr{
    String str, Revst="";
    void getStr(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string ");
        str = s.next();
    }
    void recReverse(int a){
        if(a<0){
            return;
        }
        Revst =Revst+ str.charAt(a);
        recReverse(a-1);
    }
    void check(){
        recReverse(str.length()-1);
        System.out.println("String before reversing "+str);
        System.out.println("String after reversing "+Revst);
        if(Revst.equals(str)){
            System.out.println("it is Palindrome");
        }
        else{
            System.out.println("it is not a Palindrome");
        }
    }
}
public class CS0801CS201090_A4_Q7 {
    public static void main(String[] args) {
        Revstr r = new Revstr();
        r.getStr();
        r.check();
    }
}