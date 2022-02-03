class Number{
    int n;
    Number(int n1){
        n = n1;
    }
    int factorial(int a){
        if(a==1){return 1;}
        return a*factorial(a-1);
    }
    void display(){
        System.out.println("Info from super-class Number-->");
        System.out.println("    Number = "+ n);
    }
}
class Series extends Number{
    int sum, temp;
    Series(int n1){
        super(n1);
        temp = n1;
    }
    void calsum(){
        while(temp!=0){
            sum += super.factorial(temp);
            temp--;
        }
        System.out.println("Sum calculation complete");
    }
    void display(){
        super.display();
        System.out.println("Info from sub-class Series-->");
        if(sum==0 && n!=0){
            System.out.println("    sum might not been calculated");
        }
        else {
            System.out.println("    Sum = " + sum);
        }
    }
}
public class CS0801CS201090_A3_Q10 {
    public static void main(String[] args) {
        Series s = new Series(7);
        s.calsum();
        s.display();
    }
}
