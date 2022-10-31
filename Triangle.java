public class Triangle extends Figure implements Printable {
    double sideA;
    double sideB;
    double sideC;
    public Triangle(double sideA, double sideB, double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if(sideA <= 0 || sideB <= 0 || sideC <= 0 ){
            throw new IllegalArgumentException("cannot negative value");
        }
        if(sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA){
            throw new IllegalArgumentException("It is not possible to construct a triangle from the given side lengths");
        }
    }
    @Override
    public void print() {
        System.out.println("The triangle has the following side lengths: " + sideA + ", " + sideB + ", " + sideC);
        System.out.println("The area of the triangle is: " + calculateArea());
        System.out.println("The perimeter of the triangle is: " + calculatePerimeter());
    }
    @Override
    public double calculateArea() {
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
    @Override
    public  double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    String nameOfFigure() {
        return "Triangle";
    }
}
