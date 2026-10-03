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

