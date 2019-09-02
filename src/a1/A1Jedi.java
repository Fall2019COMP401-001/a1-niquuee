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
        boolean[] logicCount = new boolean[count];

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

            //double[] custPrices = new double[amtItems];
            //boolean[] logicCount = new boolean[amtItems];
            // Array used for loop quantification
            int[] values3 = new int[amtItems];

            for (int j = 0; j < values3.length; j++) {

                itemQuant[j] = scan.nextInt();
                itemDesc[j] = scan.next();

                for (int k = 0; k < values.length; k++) {

                    //boolean[] logicCount = new boolean[values.length];
                    if (itemId[k].equals(itemDesc[j])) {
                        logicCount[k] = true;
                    }
                    if (itemDesc[j].equals(itemId[k])) {
                        totalItems[k] += itemQuant[j];
                    }

                }

            }
        }

        for (int i = 0; i < values.length; i++) {

           if (logicCount[i] == true) {
                totalCustomers[i] += 1;
            }
            //System.out.println(totalCustomers[i] + " customers bought " + totalItems[i] + " " + itemId[i]);
            //System.out.println(totalCustomers[i]);
            //System.out.println(logicCount[i]);
        }

        String customerAmt[] = new String[values.length];
        String customerTotal[] = new String[values.length];

        for (int i = 0; i < values.length; i++) {
            customerAmt[i] = String.valueOf(totalCustomers[i]);
            customerTotal[i] = String.valueOf(totalItems[i]);
            if (customerAmt[i].equals("0")) {
                customerAmt[i] = "No";
            }
            if (customerTotal[i].equals("0")) {
                customerTotal[i] = "";
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(customerAmt[i] + " customers bought " + customerTotal[i] + " " + itemId[i]);

        }
		
	}
}
