import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double D = b * b - 4 * a * c;

        // Display the discriminant
        System.out.println("Discriminant (D) = " + D);

        // Determine the nature of the roots
        if (D > 0) {
            System.out.println("The equation has two real and distinct roots.");
            double root1 = (-b + sqrt(D)) / (2 * a);
            double root2 = (-b - sqrt(D)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            System.out.println("The equation has one real and repeated root.");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has two complex roots.");
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrt(-D) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }

    // Method to calculate square root without using predefined methods
    public static double sqrt(double number) {
        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }
}

OUTPUT:
Enter coefficient a: 5
Enter coefficient b: 8
Enter coefficient c: 7
Discriminant (D) = -76.0
The equation has two complex roots.
Root 1: -0.8 + 0.8717797887081347i
Root 2: -0.8 - 0.8717797887081347i
