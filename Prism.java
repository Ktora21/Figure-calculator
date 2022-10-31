public class Prism implements Printable {
    Figure base;
    double height;

    @Override
    public void print() {
        System.out.println("The basis of this prism is " + base.nameOfFigure());
        System.out.println("Height of the prism is " + height);
        System.out.println("Area of the prism is " + calculatePrismArea());
        System.out.println("Volume of the prism is " + calculatePrismVolume());
    }

    public Prism(Figure figure, double height)
    {
        this.base = figure;
        this.height = height;
        if(height <= 0 ){
            throw new IllegalArgumentException("Wrong prism height value. The value cannot be negative");
        }
    }
    public double calculatePrismArea(){
        return 2* base.calculateArea() + height*base.calculatePerimeter();
    }
    public double calculatePrismVolume(){
        return base.calculateArea()*height;
    }
}
