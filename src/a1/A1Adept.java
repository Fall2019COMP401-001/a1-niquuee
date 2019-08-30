package a1;

import java.util.Scanner;

public class A1Adept {

	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        // Your code follows here.

	        // count asks the user for amount of items in the store
	        // and then creates 3 arrays to store the next set of
	        // information.
	        int count = scan.nextInt();

	        String[] itemId = new String[count];
	        double[] itemPrice = new double[count];

	        int[] values = new int[count];

	        for (int i = 0; i < values.length; i++) {

	            itemId[i] = scan.next();
	            itemPrice[i] = scan.nextDouble();

	        }

	        // This variable asks user for amount of customers
	        int amtCustomers = scan.nextInt();

	        // Arrays created based on users input for the amount
	        // of customers
	        String[] firstName = new String[amtCustomers];
	        String[] lastName = new String[amtCustomers];

	        double[] sumPrice = new double[amtCustomers];

	        // Variables used for final output, where maxVal,
	        // minVal will be int numbers from method return
	        // avgPrice used for calculation.
	        int maxVal = 0;
	        int minVal = 0;
	        double avgPrice = 0.0;


	        // Array used for loop quantification.
	        int[] values2 = new int[amtCustomers];

	        for (int i = 0; i < values2.length; i++) {
	            // Get first name, and last name from user input
	            firstName[i] = scan.next();
	            lastName[i] = scan.next();

	            int amtItems = scan.nextInt(); // Takes input for amount of items

	            // Creating 3 new arrays based on input for amount
	            // of items requested. Asks user for quantity of items,
	            // Description of the item and stores those values into the new
	            // arrays.
	            int[] itemQuant = new int[amtItems];
	            String[] itemDesc = new String[amtItems];

	            // Array used for loop quantification
	            int[] values3 = new int[amtItems];

	            for (int j = 0; j < values3.length; j++) {

	                itemQuant[j] = scan.nextInt();
	                itemDesc[j] = scan.next();


	                // For-loop that determines if the item description
	                // matches the item id that was stored in the itemId[]
	                // array. If there is a match, take the location of the
	                // item id to find the price of the item and calculate its
	                // total cost.
	              for (int k = 0; k < values.length; k++) {

	                  if (itemDesc[j].equals(itemId[k])) {
	                      sumPrice[i] += (itemQuant[j] * itemPrice[k]);

	                  }
	              }

	            }

	        }

	        // For-loop that calculates the average price
	        // of the total prices found for each customer
	        // from the array sumPrice[].
	        for (int i = 0; i < sumPrice.length; i++) {

	            double sumValues = 0.0;
	            sumValues += sumPrice[i];
	            avgPrice += (sumValues / sumPrice.length);
	        }

	        // Call biggest to find the biggest value location
	        // in the array, and smallest to find the smallest
	        // value location.
	        maxVal = biggest(sumPrice);
	        minVal = smallest(sumPrice);



	        System.out.println("Biggest: " + firstName[maxVal] + " " + lastName[maxVal] + " "
	        + "(" + String.format("%.2f", sumPrice[maxVal]) + ")");

	        System.out.println("Smallest: " + firstName[minVal] + " " + lastName[minVal] + " "
	                + "(" + String.format("%.2f", sumPrice[minVal]) + ")");

	        System.out.println("Average: " + " " + String.format("%.2f", avgPrice));
	    }


	    // Method that uses sumPrice[] as passing parameter,
	    // and then finds the biggest value in the array
	    // where tmp is given the location of the array of
	    // that value and sent back.
	    static int biggest (double priceMax[]) {
	        double maxVal = priceMax[0];
	        int tmp = 0;
	        for (int i = 1; i < priceMax.length; i++) {
	            if (priceMax[i] > maxVal) {
	                maxVal = priceMax[i];
	                tmp = i;
	            }
	        }
	        return tmp;
	    }

	    // This method is the same as biggest, except
	    // that it will find the smallest value in the array.
	    static int smallest (double priceSmall[]) {
	        double smallVal = priceSmall[0];
	        int tmp = 0;
	        for (int i = 1; i < priceSmall.length; i++) {
	            if (priceSmall[i] < smallVal) {
	                smallVal = priceSmall[i];
	                tmp = i;
	            }
	        }
	        return tmp;
	    }

}
