import java.lang.Math;
import java.util.Scanner;
public class CS0801201090A103
   public static void main (String[] args)
   {
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
     primefactors(n);
   }


   public static void primefactors(int n)
     { 
      for(int i=n;i>1;i--)
    
     { if(prime(i)==true)
       { if(n%i==0)
         { for(int m=1;n%i==0;m++)
          {   System.out.print(+i+"*");
             n/=i;       
          }
         }
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
}