
import java.util.Scanner;


public class LargestOfThreeInts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Asking the user for three integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        int largest;

        // Nested if statements to determine the largest
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);
    }
}