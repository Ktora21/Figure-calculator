import static java.lang.Math.*;
public class Circle extends Figure implements Printable {
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
        if(radius <= 0){
            throw new IllegalArgumentException("The value of the radius cannot be negative");
        }
    }

    @Override
    public void print() {
        System.out.println("Radius of the circle is " + radius);
        System.out.println("Area of the circle is " + calculateArea());
        System.out.println("Perimeter of the circle is " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2* Math.PI  * radius;
    }

    @Override
    public String nameOfFigure() {
        return "Circle";
    }
}
