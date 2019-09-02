package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();

        String[] itemId = new String[count];
        double[] itemPrice = new double[count];

        int[] totalCustomers = new int[count];
        int[] totalItems = new int[count];

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

        // Array used for loop quantification.
        int[] values2 = new int[amtCustomers];

        for (int i = 0; i < values2.length; i++) {
            // Get first name, and last name from user input
            // And create new boolean array to check if customer has already
            // purchased an item. If purchased = true.
            boolean[] logic = new boolean[values.length];
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

                for (int k = 0; k < values.length; k++) {

                    // Checks if the two arrays match, if there is a match
                    // Increment the appropriate arrays for count
                    // and change false array to true.
                    if (itemDesc[j].equals(itemId[k])) {
                        totalItems[k] += itemQuant[j];
                        logic[k] = true;
                    }

                }

            }

            // For-Loop that evaluates the new array true/false
            // array for each customer
            for (int k = 0; k < values.length; k++) {
                if (logic[k]) {
                    totalCustomers[k]++;
                }
            }

        }


        // Two new arrays to change int value of arrays into
        // String arrays for output.
        String customerAmt[] = new String[values.length];
        String customerTotal[] = new String[values.length];

        for (int i = 0; i < values.length; i++) {
            customerAmt[i] = String.valueOf(totalCustomers[i]);
            customerTotal[i] = String.valueOf(totalItems[i]);
            if (customerAmt[i].equals("0") || customerTotal[i].equals("0")) {
                System.out.println("No customers bought " + itemId[i]);
            }
            else {
                System.out.println(customerAmt[i] + " customers bought " + customerTotal[i] + " " + itemId[i]);
            }
        }
		
	}
}
