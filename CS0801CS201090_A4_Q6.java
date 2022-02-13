import java.util.Scanner;
class Perfect{
    int num;
    Perfect(int nn){
        this.num = nn;
    }
    int sum_of_factors(int i, int factor){
        if(factor==1){
            return 1;
        }
        if(i%factor==0) {
            return factor+sum_of_factors(i, factor-1);
        }
        else {
            return sum_of_factors(i, factor - 1);
        }
    }
    void check(){
        if(sum_of_factors(num,num-1)==num){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
    }
}
public class CS0801CS201090_A4_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. ");
        int a = sc.nextInt();
        Perfect p1 = new Perfect(a);
        p1.check();
    }
}