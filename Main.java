import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the figure calculator!");

        for(;;) {

            System.out.println("\nSelect figure for which you want to calculate the values or exit the program");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Regular prism");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    try {
                        Circle circle = new Circle(radius);
                        circle.print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Wrong data");
                    }
                }
                case 2 -> {
                    System.out.println("Enter the first side length: ");
                    double sideA = scanner.nextDouble();
                    System.out.println("Enter the second side length: ");
                    double sideB = scanner.nextDouble();
                    System.out.println("Enter the third side length: ");
                    double sideC = scanner.nextDouble();
                    try {
                        Triangle triangle = new Triangle(sideA, sideB, sideC);
                        triangle.print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Wrong data");
                    }
                }
                case 3 -> {
                    System.out.println("Enter the side length: ");
                    double side = scanner.nextDouble();
                    try {
                        Square square = new Square(side);
                        square.print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Wrong data");
                    }
                }
                case 4 -> {
                    System.out.println("Choose the figure to be the base of the regular prism: ");
                    System.out.println("1. Triangle");
                    System.out.println("2. Square");
                    int nextChoice = scanner.nextInt();
                    switch (nextChoice) {
                        case 1 -> {
                            System.out.println("Enter the side length: ");
                            double sideA = scanner.nextDouble();
                            System.out.println("Enter height of prism: ");
                            double heightTriangularPrism = scanner.nextDouble();
                            try {
                                Triangle baseTriangle = new Triangle(sideA, sideA, sideA);
                                Prism triangularPrism = new Prism(baseTriangle, heightTriangularPrism);
                                triangularPrism.print();
                            } catch (IllegalArgumentException ex) {
                                System.out.println("Wrong data");
                            }
                        }
                        case 2 -> {
                            System.out.println("Enter the side length: ");
                            double squareSide = scanner.nextDouble();
                            System.out.println("Enter height of prism: ");
                            double heightRegularPrism = scanner.nextDouble();
                            try {
                                Square baseSquare = new Square(squareSide);
                                Prism quadrangularPrism = new Prism(baseSquare, heightRegularPrism);
                                quadrangularPrism.print();
                            } catch (IllegalArgumentException ex) {
                                System.out.println("Wrong data");
                            }
                        }
                        default -> System.out.println("Wrong action number");
                    }
                }
                case 5 -> System.exit(0);  // indicates successful termination
                default -> System.out.println("Wrong action number");
            }
        }
    }
}