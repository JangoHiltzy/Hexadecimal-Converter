import java.util.Scanner;

public class Main {

    // CONVERTS A DECIMAL NUMBER TO ITS HEXADECIMAL REPRESENTATION
    public static void ConvertToHexadecimal(Scanner scanner) {
        int number;

        // ASK USER TO ENTER A DECIMAL NUMBER TO CONVERT TO HEXADECIMAL
        System.out.println("Enter a decimal number to convert to hexadecimal:");

        // VERIFY IF THE USER ENTERED A VALID INTEGER
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            // HANDLE CASE IF THE DECIMAL NUMBER IS 0 (ITS HEXADECIMAL IS JUST "0")
            if (number == 0) {
                System.out.println("Hexadecimal representation: 0");
                return; // EXIT EARLY FOR DECIMAL NUMBER 0
            }

            // CONVERT THE DECIMAL NUMBER TO HEXADECIMAL USING Integer.toHexString()
            String hex = Integer.toHexString(number).toUpperCase();
            System.out.println("Hexadecimal representation: " + hex);
        } else {
            // IF USER ENTERS AN INVALID INPUT, SHOW ERROR MESSAGE
            System.out.println("Invalid input. Please enter a valid decimal number.");
            scanner.nextLine(); // CLEAR INVALID CHARACTERS
        }
    }

    // CONVERTS A HEXADECIMAL STRING TO ITS DECIMAL EQUIVALENT
    public static void ConvertToDecimal(Scanner scanner) {
        String hex;

        // ASK USER TO ENTER A HEXADECIMAL STRING TO CONVERT TO A DECIMAL NUMBER
        System.out.println("Enter a hexadecimal to convert to a decimal number:");

        // GET USER INPUT FOR HEXADECIMAL STRING
        if (scanner.hasNext()) {
            hex = scanner.next();

            // CHECK IF THE HEXADECIMAL STRING ONLY CONTAINS VALID HEXADECIMAL CHARACTERS
            if (!hex.matches("[0-9A-Fa-f]+")) {
                System.out.println("Invalid hexadecimal input. Only '0-9' and 'A-F' are allowed.");
                return; // EXIT IF HEXADECIMAL INPUT IS INVALID
            }

            // CONVERT THE HEXADECIMAL STRING TO A DECIMAL INTEGER USING Integer.parseInt()
            try {
                int number = Integer.parseInt(hex, 16);
                System.out.println("Decimal representation: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid hexadecimal input.");
            }
        } else {
            // IF USER ENTERS AN INVALID INPUT, SHOW ERROR MESSAGE
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
            scanner.nextLine(); // CLEAR INVALID INPUT
        }
    }
}
