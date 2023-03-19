import java.util.*;
class ArrayConcatenation
{
 public static void main(String[] args)
{
 int n,m,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Limit of First Array");
 n=sc.nextInt();
 int a[]=new int [n];
 System.out.println("Enter The Elements");
 for(i=0;i<n;i++)
 a[i]=sc.nextInt();
System.out.println("Enter The Limit of Second Array");
 m=sc.nextInt();
 int b[]=new int [m];
 System.out.println("Enter The Elements");
 for(j=0;j<m;j++)
 b[j]=sc.nextInt();
 int c[]=new int [a.length+b.length];
 System.arraycopy(a,0,c,0,a.length);
 System.arraycopy(b,0,c,a.length,b.length);
 System.out.println(Arrays.toString(c));
}
} 

