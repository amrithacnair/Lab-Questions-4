import java.util.*;
class StringIsEmptyNull
{
 public static void main(String[] args)
{
 String str=null;
 if(str==null)
 System.out.println("The String is Null");
 else if(str.isEmpty())
 System.out.println("The String is Empty");
 else
 System.out.println("The String is Neither empty or null");
}
}