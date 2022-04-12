import java.util.Scanner;

class CS0801201090A109
{
   public static void main(String args[])
   {
    Scanner ab= new Scanner(System.in);
    int n= ab.nextInt();
    int flag=0;
    for(int i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      {
        flag++;
      }
      }
      if(flag==1){
      System.out.println("The number is T-prime"); }
      else{ System.out.println("The number is not T-prime");}
     
       
     
     
    }
  
}