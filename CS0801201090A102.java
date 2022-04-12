class CS0801201090A102
{
   public static void main(String[] args)
   { int k=0;
   int i=2;
   // we initialise j = 4 and before that
//we have two prime number(2,3) so i=2;
     for(int j=4;j>0;j++)
    
     {
       if(prime(j)==true){
        
         k++;
       }
       if(k==(1000-i))
       {
         System.out.println("1000th prime number is :"+j);
         break;
       }
     }
     }
      
  
public static boolean  prime(int a)
   {
 
     for(int i=2;i<=Math.sqrt(a);i++)
     {
      if(a%i==0){
     return false;
    
     }
    else continue;
     }
   return true;
}
}