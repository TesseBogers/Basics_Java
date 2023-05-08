import java.util.Random; // Import the Random class

public class HelloExceptions { // Class name
    public static void main(String[] args) { // Main method
        Random random = new Random(); // Create a new random number generator

        Integer[] array = new Integer[4]; // Create a new array of size 10

        for (int i = 0; i < array.length; i++) { // Fill the array with random numbers
            array[i] = random.nextInt(10); // Random integer between 0 and 10
        }

        for (Integer integer : array) { // Loop over the array and print out each element
            System.out.print("Random number: " + integer + ". "); // Print out the element
        }

        int n = array.length;

        try {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print(array[i] + " ");
                } else {
                    // divide element from previous element
                    Integer divide = array[i] / array[i - 1];
                    System.out.print(divide + " ");
                }
            }
        } catch (ArithmeticException e) { // Catch division by zero
            System.out.println("Error: Division by zero"); // Print error message
        }
    }
}
