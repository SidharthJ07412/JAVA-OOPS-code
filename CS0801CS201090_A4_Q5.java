import java.util.Scanner;
class Happy{
    int n;
    Happy(){
        this.n = 0;
    }
    void getnum(int nn){
        this.n = nn;
    }
    int sum_sq_digits(int x){
        if(x<10){
            return x;
        }
        int sum=0;
        while(x>0){
            sum = sum+(x%10)*(x%10);
            x=x/10;
        }
        return sum_sq_digits(sum);
    }
    void ishappy(){
        if(sum_sq_digits(n)==1){
            System.out.println( n +" is a Happy Number ");
        }
        else{
            System.out.println(n +" is not a Happy Number ");
        }
    }
}
public class CS0801CS201090_A4_Q5 {
    public static void main(String[] args) {
        System.out.print("Enter no.");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        Happy h = new Happy();
        h.getnum(a);
        h.ishappy();
    }
}