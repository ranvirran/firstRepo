import java.util.Scanner;

public class Sum
{
   public static void main(String[] args)
     {
     int a,b;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a number.");
     a=input.nextInt();
     System.out.println("Enter a number.");
     b=input.nextInt();
     System.out.println("sum="+(a+b));
     }
}