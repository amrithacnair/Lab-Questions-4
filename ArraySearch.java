import java.util.Scanner;
class ArraySearch
 {
 public static void main(String[] args)
 {
  int a[]=new int[5];
  Scanner sc=new Scanner(System.in);
  int  count=0,i;
  System.out.println("Enter The Elements:");
  for(i=0;i<a.length;i++)
    a[i]=sc.nextInt();
 System.out.println("The Elements in Array:");
 for(i=0;i<a.length;i++)
   System.out.println(a[i]);
 System.out.println("Enter the elements to be searched");
  int e=sc.nextInt();
for(i=0;i<a.length;i++)
 {
  if(a[i]==e)
   count=count+1;
 }
 System.out.println("The Elements to be Searched   is "+e);
 if(count>0)
  System.out.println("The Element  "+e+"   is present in the array in "+count+"   times");
else
  System.out.println("The Element is not Present in Array");
 }
}