import java.util.Scanner;
class Change{
    String str, newstr;
    int len;
    Change(){
        newstr="";
        str="";
    }
    void intputword(){
        System.out.print("Enter string ");
        Scanner s = new Scanner(System.in);
        str = s.next();
        len = str.length();
    }
    char caseconvert(char ch){
        if(ch==Character.toUpperCase(ch)){
            return Character.toLowerCase(ch);
        }
        else{
            return Character.toUpperCase(ch);
        }
    }
    void recchange(int a){
        if(a>=len){
            return;
        }
        newstr =newstr + caseconvert(str.charAt(a));
        recchange(a+1);
    }
    void display(){
        System.out.println("user input String  "+str);
        System.out.println("String changed to opposite case  "+newstr);
    }
}
public class CS0801CS201090_A4_Q8  {
    public static void main(String[] args) {
        Change c = new Change();
        c.intputword();
        c.recchange(0);
        c.display();
    }
}