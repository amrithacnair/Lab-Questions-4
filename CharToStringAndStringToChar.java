import java.util.*;
class CharToStringAndStringToChar
{
 public static void main(String[] args)
 {
   char c;
   System.out.println("Enter The Character");
   Scanner sc=new Scanner(System.in);
   c=sc.nextLine().charAt(0);
   System.out.println("The Character is "+c);
  String s=String.valueOf(c);
 System.out.println("Converted character...."+c+"...to String..."+s);
  String str;
 System.out.println("Enter The String");
  str=sc.nextLine();
 char ch=str.charAt(0);
System.out.println("The Entered String...."+str+"..Converted to Character.."+ch);

}
}
  
