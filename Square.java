public class Square extends Figure implements Printable {
    double side;
    public Square(double side){
        this.side = side;
        if(side <= 0){
            throw new IllegalArgumentException("The value of the side cannot be negative");
        }
    }

    @Override
    public void print() {
        System.out.println("Side of the square is " + side);
        System.out.println("Area of the square is " + calculateArea());
        System.out.println("Perimeter of the square is " + calculatePerimeter());
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    String nameOfFigure() {
        return "Square";
    }
}

