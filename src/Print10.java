import java.util.Random;
import java.util.Scanner;

public class Print10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        Random rd = new Random(); // creating Random object
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50); // storing random integers in an array
                if (arr[i] < x)
                    System.out.println(arr[i]);
        }
    }
}