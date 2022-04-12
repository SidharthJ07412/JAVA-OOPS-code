import java.util.Scanner;
import java.lang.Math;


public class CS0801201090A104
{ public static void main(String[] args){
  
  Scanner aa= new Scanner(System.in);
    int n= aa.nextInt();
    int p,j,flag=1;
   for(j=n;j>0;j++)
{
   if(prime(j)==true)
        {
         for(p=j/10;p>0;p/=10)
           {
             if(prime(p)==true)
                {
                flag =1;
                }   
             else {
                   flag=0;
                   break;
                  }   
           }
        }
       else continue;

         if (flag==1){
         System.out.println(j);
         break;}
    else continue; 
        
}
   }
      
   public static boolean  prime(int a)
  {
     for(int i=2;i<=Math.sqrt(a);i++)
     {
      if(a%i==0){
     return false; }
       else continue;
     }
     return true;
  }
 }