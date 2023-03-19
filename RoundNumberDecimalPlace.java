import java.util.*;
 
class RoundNumberDecimalPlace{
 
    public static void main(String[] args)
    {
        
        double number;
        int n;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextDouble();
        System.out.println("The Decimal point needed");
         n=sc.nextInt();
         System.out.println("The Result Number");
        //System.out.format("%.2f", number);
       number = Math.round(number * Math.pow(10, n))
                 / Math.pow(10, n);
       System.out.println(number);
    }
}
