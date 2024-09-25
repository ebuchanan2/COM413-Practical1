import java.util.*;
public class Question2 {
    public static void main(String[] args){
        //Initialise scanner
        Scanner sc = new Scanner(System.in);

        //Initialises variables
        int a;
        int b;
        int choice = 0;
        int sum;
        int difference;
        int product;
        double quotient;

        System.out.println("Enter first number: ");
        a = sc.nextInt();

        System.out.println("Enter second number: ");
        b = sc.nextInt();

        System.out.println("");

        //Does calculations
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;

        //Prints out results
        System.out.println("Sum: " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
