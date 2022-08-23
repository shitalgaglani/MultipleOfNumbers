import java.util.*;

public class MultipleOfNumbers {

    public static void main(String[] args) {

        int x, mult;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number for calculating multiples of A and X: ");

        int a = sc.nextInt();

        for (x = 1; x <= 10; x++) {

            mult = (a) * (x);

            System.out.println("Multiples of A = " + (a) + " * " + "until X = " + (x) + " = " + mult);
        }

        for (x = 1; x <= 10; x++) {

            mult = (a + 1) * (2*x);

            System.out.println("Multiples of A + 1 = " + (a + 1) + " * " + "until 2X = " + (2 * x) + " = " + mult);
        }

        for (x = 1; x <= 10; x++) {

            mult = (a + 2) * (3*x);

            System.out.println("Multiples of A + 2 = " + (a + 2) + " * " + "until 3X = " + (3 * x) + " = " + mult);
        }
    }
}