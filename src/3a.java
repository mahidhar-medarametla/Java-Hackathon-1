//3a) Data Types:

//Write a Java program to store and display the following details of a waste collection vehicle:

//Vehicle number – integer
//Waste collected in kilograms – decimal value
//Number of collection points – integer
//Vehicle status – character
//Use appropriate Java data types for each value and display all the details.  


public class WasteVehicleDetails {
    public static void main(String[] args) {
        
        int vehicleNumber = 1111;
        double wasteCollectedKg = 264.45;
	int collectionPoints = 18;
        char vehicleStatus = 'A';

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected KG: " + wasteCollectedKg);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }
}

