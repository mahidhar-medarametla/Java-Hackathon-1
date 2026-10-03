
//Write a Java program to check the waste collection status based on the amount of waste collected. Read the waste collected in kilograms.

//If the waste collected is 100 kg or more, display "Collection Target Achieved".
//Otherwise, display "More Waste Collection Required".
//Use an if-else statement.


import java.util.Scanner;

	public class WasteStatusChecker {
   	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of waste in kilograms: ");
        double wasteCollected = scanner.nextDouble();

        if (wasteCollected >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}

