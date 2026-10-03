//Write a Java program to calculate the total waste collected from two collection points using a method.

//Create the following method:

//calculateTotalWaste(double point1Waste, double point2Waste)
//The method should return the total waste collected. Read the waste collected at the two collection points from the user, call the method, and display the total waste collected.



import java.util.Scanner;

public class WasteCollection {

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at Point 1: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste at Point 2: ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected: " + totalWaste);
 
}
}

