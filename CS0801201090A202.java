import java.util.Scanner;
  import java.lang.Math;
  import java.util.Arrays;

class CS0801201090A202
{
   public static void main(String args[])
   {
Scanner x = new Scanner(System.in);
System.out.println("order of bigger square Matrix(N):");
int n = x.nextInt();
System.out.println("order of small Square Matrix(k):");
int k = x.nextInt();


int m=1;
int i,j;
int [][] arr = new int[n][n];
int [][] arrr = new int [k][k];
int [][] ar = new int [k][k];
System.out.println("Output array of medians:");
for( i=0;i <n;i++)
{
   for( j=0;j<n;j++)
   {
      arr[i][j]=m;
      m++; 
   }
}

m=1;

for( i=0;i <k;i++)
{
   for( j=0;j<k;j++)
   {
     if(m==1)
     {
       arrr[i][j]=1;
     }
     else{
      arrr[i][j]=m%2;
      m++;  }
   }
}

for(int a=0;a<n-k+1;a++)
{
   for(int b=0;b<n-k+1;b++)
   {
for( i=0;i<k;i++)
{
   for(j=0;j<k;j++)
   {
   
     ar[i][j] = (arr[i+a][j+b])*(arrr[i][j]);
    
   }
}
System.out.print(ar[k/2][k/2]+" ");
for(i=0;i<k;i++)
{
   for(j=0;j<k;j++)
   {
     ar[i][j]=0;
   }
  
}

}
System.out.println();
}

  
   }
  
   }
    