import java.util.Scanner;
  import java.lang.Math;

class CS0801201090A201
{
   public static void main(String args[])
   {
Scanner x = new Scanner(System.in);
int n = x.nextInt();

int k=1;
int i,j;
int [][] arr = new int[n][n];
for( i=0;i <n;i++)
{
   for( j=0;j<n;j++)
   {
      arr[i][j]=k;
      k++; 
   }
}

i=0;
j=0;
boolean right= true;
while(i<n&&j<n)
{
   if(right)
   {
     while(i>0 && j<n-1){
       System.out.print(arr[i][j]+" ");
       i--;
       j++;
      
     }
     if(j==n-1)
     { System.out.print(arr[i][j]+" ");
       i++;
     }
     else { System.out.print(arr[i][j]+" ");
     j++;
     }
    
   }
   else { while(i<n-1 && j>0)
   { System.out.print(arr[i][j]+" ");
     i++;
     j--;
     }
     if(i==n-1)
     { System.out.print(arr[i][j]+" ");
       j++;
     }
     else{ System.out.print(arr[i][j]+" ");
        i++;}}
     right=!right;
   }
  
   }
  
   }
  

















