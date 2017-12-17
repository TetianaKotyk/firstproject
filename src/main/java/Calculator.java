import java.util.Scanner;

/**
 * @author Tetiana
 * @see #main(String[])
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float i = scanner.nextFloat();

        System.out.println("Enter the second number:");
        float isec = scanner.nextFloat();

        float result = i + isec;
        System.out.printf("Sum result is: %.4f" , result);

        scanner.close();
    }
}