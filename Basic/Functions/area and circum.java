import java.util.*;
class Number{
 static double Area(double radius){
     return 3.14 * radius * radius;
}
static double Circum(double radius){
    return 2 * 3.14 * radius;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius =sc.nextDouble();
        double Circumference = Circum(radius);
        double area = Area(radius);
       System.out.println("Area: "+area);
       System.out.println("Circumference: "+Circumference);
    }
}
