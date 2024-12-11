package hust.soict.dsai.lab01;
import java.util.Scanner;

public class Ex64 {
    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(String monthInput, int year) {
        // Convert month input to lower case for case-insensitive comparison
        String month = monthInput.toLowerCase();
        int days = 0;

        switch (month) {
            case "1":
            case "jan":
            case "jan.":
            case "january":
                days = 31;
                break;
            case "2":
            case "feb":
            case "feb.":
            case "february":
                days = isLeapYear(year) ? 29 : 28;
                break;
            case "3":
            case "mar":
            case "mar.":
            case "march":
                days = 31;
                break;
            case "4":
            case "apr":
            case "apr.":
            case "april":
                days = 30;
                break;
            case "5":
            case "may":
                days = 31;
                break;
            case "6":
            case "jun":
            case "jun.":
            case "june":
                days = 30;
                break;
            case "7":
            case "jul":
            case "jul.":
            case "july":
                days = 31;
                break;
            case "8":
            case "aug":
            case "aug.":
            case "august":
                days = 31;
                break;
            case "9":
            case "sep":
            case "sep.":
            case "september":
                days = 30;
                break;
            case "10":
            case "oct":
            case "oct.":
            case "october":
                days = 31;
                break;
            case "11":
            case "nov":
            case "nov.":
            case "november":
                days = 30;
                break;
            case "12":
            case "dec":
            case "dec.":
            case "december":
                days = 31;
                break;
            default:
                throw new IllegalArgumentException("Invalid month input.");
        }

        return days;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = "";
        int year = -1;

        while (true) {
            try {
                // Get month input from the user
                System.out.print("Enter a month (full name, abbreviation, or number): ");
                month = scanner.nextLine();

                // Get year input from the user
                System.out.print("Enter a year (non-negative integer): ");
                year = Integer.parseInt(scanner.nextLine());

                // Check if the year is valid
                if (year < 0) {
                    throw new IllegalArgumentException("Year must be a non-negative integer.");
                }

                // Get and display the number of days in the month
                int days = getDaysInMonth(month, year);
                System.out.println("Number of days in " + month + " of year " + year + ": " + days);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}
