import java.util.Scanner;
import java.lang.Math.*;

public class Circle
{
   public static void main(String[] args)
     {
     int a,b;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a number.");
     a=input.nextInt();
     System.out.println("Area of a Circle = "+(Math.PI*a*a));
     System.out.println("Circumference of a Circle = "+(2*Math.PI*a));
     }
}