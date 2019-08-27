package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
        // int count asks the user for how many people they want to input
        int count = scan.nextInt();

        // Three arrays are created, one to store the first name of the customer
        // another to store the last name of the customer
        // and another array that stores the calculations of the price total
        String[] firstName = new String[count];
        String[] lastName = new String[count];
        double[] sumPrice = new double[count];


        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            // Asks the user for the names and then stores them in the first location
            // and goes to next once the first amount of information is filled.
            firstName[i] = scan.next();
            lastName[i] = scan.next();
            int amtItems = scan.nextInt();

            // Three new arrays are created, one array to store quantity of items
            // another array to store the description of the item
            // another array to store the prices of the items.
            int[] itemQuant = new int[amtItems];
            String[] itemDesc = new String[amtItems];
            double[] itemPrice = new double[amtItems];

            // For-loop that enters information sequentially into the arrays
            for (int j = 0; j < amtItems; j++) {

                itemQuant[j] = scan.nextInt();
                itemDesc[j] = scan.next();
                itemPrice[j] = scan.nextDouble();

                // Calculation of the total sum of the customers order
                sumPrice[i] += (itemPrice[j] * itemQuant[j]);
            }

        }

        // Calling the firstInitial method to get the first character
        // of the first name.
        char firstInitial[] = getFirstInitial(firstName);

        for (int i = 0; i < values.length; i++) {
            System.out.println(firstInitial[i] + ". " + lastName[i] + ": " + String.format("%.2f", sumPrice[i]));
        }
		
	}
	
    // This method grabs the First name from the firstName array and dissects
    // the first char from the name and stores in a new array
    // containing just the first character of the name.

    public static char[] getFirstInitial(String[] firstInit) {

        char firstChar[] = new char[firstInit.length];
        for (int i = 0; i < firstInit.length; i++) {
            firstChar[i] = firstInit[i].charAt(0);
        }
        return firstChar;

    }
}
