import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Initialize Scanner for User Input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter a year: ");

        // Read the User's Input
        int year = scanner.nextInt();

        // Implement Leap Year Logic and check if its a leap year or not 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the Scanner
        scanner.close();
    }
}