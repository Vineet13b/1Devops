import java.util.Scanner;
/*class to find area of triangle*/
class areaTriangle{
    double area(double b,double h)
    {
        double Tarea = b*h*0.5 ;
        return Tarea;
       }
 }
 /*class to find area of square*/
class areaSquare extends areaTriangle{
    double area(double a)
    {
         return a*a;
    }
}
/*main class for finding the area of square and trinagle using inheritance*/
public class areaprgm extends areaSquare{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        areaprgm Area =  new areaprgm();
        System.out.println("Enter the side of the square : ");
        double side = s.nextDouble();
        System.out.println("Enter the base of the triangle : ");
        double base = s.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double height = s.nextDouble();
        System.out.println("Area of square = "+Area.area(side));
        System.out.println("Area of Triangle = "+Area.area(base,height));
        s.close();
    }
}
 
