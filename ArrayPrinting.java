import java.util.*;
class ArrayPrinting
{
 public static void main(String[] args)
{
 int n,i;
 System.out.println("Enter The Limit of Array");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int [n];
 System.out.println("Enter The Elements in Array");
 for(i=0;i<n;i++)
 {
  a[i]=sc.nextInt();
 }
System.out.println("The Array is.....");
 for(i=0;i<n;i++)
 {
   System.out.print(a[i]+"   ");
 }
}
}