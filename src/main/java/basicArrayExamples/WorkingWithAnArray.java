package basicArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class WorkingWithAnArray {
    // Static method to generate an array of a specified quantity of random numbers
    public static int[] getRandoms(int quantity){
        // Create a random number generator
        Random randomGenerator = new Random();
        // Create an array to store the random numbers
        int [] randoms = new int[quantity];
        // Fill the array
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = randomGenerator.nextInt();
        }
        // Return the result
        return randoms;
    }

    public static void main(String[] args) {
        String [] names = {"Helen", "Frannie", "Mitch"};
        int [] ages = {3, 12, 4};

        // Access a specific position
        System.out.println("First name: " + names[0]);
        // Change the value at a specific position
        names[1] = "Francis";

        // For loop iterating through the content of an array
        System.out.println("Print the content of the names array using a for loop:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ") " + names[i]);
        }

        // Helper method to print an array's content on a single line (list str format)
        System.out.println("Print the contents of the names array using a helper method:");
        System.out.println(Arrays.toString(names));

        // Enhanced for loop (for each loop) iterating through content of an array
        System.out.println("Print the contents of the ages array using a for each loop");
        for (int age : ages) {
            System.out.println(age);
        }

        // Get an array filled with 5 random numbers and display the contents
        int [] randomNumbers = getRandoms(5);
        System.out.println("Display 5 generated random numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(i + ") " + randomNumbers[i]);
        }
    }
}
