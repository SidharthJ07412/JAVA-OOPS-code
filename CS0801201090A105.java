import java.util.Scanner;
import java.lang.Math;

public class CS0801201090A105{
public static void main(String[] args){
Scanner x = new Scanner(System.in);
int n = x.nextInt();
int t;
{  if(prime(n)==true){
         for(int i=1;i<digit(n);i++)
           { 
             t=n%10;
             n/=10;
            n+=(Math.pow(10,digit(n))*t);
           if(prime(n)==true){ continue ;}
            }System.out.println("Number is a circular prime number"); 
          }
            else{ System.out.println("Not a circular prime number");             
                    } 
}
}

public static boolean prime(int a){
 for(int i=2;i<=Math.sqrt(a);i++)
{
 if(a%i==0)
{ return false; }
else continue;
}
return true;
}
public static int digit(int b){
int i;
for( i=0;i>=0;i++)
{ if(b>0){ b/=10; }
 else break;
}                           
return i ;
 }


}

















