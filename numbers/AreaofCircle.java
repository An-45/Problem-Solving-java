import java.lang.Math;
import java.util.Scanner;

public class AreaofCircle {
    public static double CheckArea(double r) {
        double area =Math.PI*(r*r);
        return area;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r:");
        double rad = sc.nextDouble();
        System.out.println("The Area of the circle is :"+CheckArea(rad));
    }
    
}
