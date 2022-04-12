import java.util.Scanner;

public class CS0801201090A106
{
 public static void main(String[] args) {
 Scanner ab = new Scanner(System.in);
 int n= ab.nextInt(); 
 int k= ab.nextInt();
 int p,j,l=0,m=0; 
 for( j=2;j>0;j++)
 { 
  if(prime(j)==true){ 
        l++; }
    if(l==(n))
 {  System.out.println("n th prime number is :"+j);
 break;
 } 
   }
  for( p=2;p>0;p++)
 { 
  if(prime(p)==true){ 
        m++; }
    if(m==(n+k))
 {  System.out.println("n+k th prime number is :"+p);
 break;
 } 
    } System.out.println("Difference between (n+k)th and nth prime number is:"+(p-j));
      } 
public static boolean prime(int a)
 { 
for(int i=2;i<a;i++)
 { 
if(a%i==0)
{ return false;} 
else if (a==2)
{ return false; }
 else continue; 
} 
return true;
 }
}