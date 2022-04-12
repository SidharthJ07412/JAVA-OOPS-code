import java.lang.Math;
import java.util.Scanner;
public class CS0801201090A101 {
public static void main(String[] args){
System.out.println("taking input from user:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i,flag;
double sum=0;
for(i=2;i<=n;i++)

{ flag=1;
for(int j=2;j<i;j++)
{
if(i%j==0){ flag=0; }


}
if(flag==1){
sum+= Math.log(i);
 } 
}
System.out.println(sum);
System.out.println(n);
System.out.println(sum/n);
}
}

  