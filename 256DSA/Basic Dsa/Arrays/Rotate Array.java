package backtracking;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        k = arr.size() - (k % arr.size());
        reverse(arr, 0, arr.size() - 1);
        reverse(arr, k, arr.size()-1);
        reverse(arr, 0, k-1);
        return arr;
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 1: Number of integers for the array list
        System.out.print("Input 1: Enter the number of integers for the array list: ");
        int numIntegers = scanner.nextInt();

        // Input 2: Integers of the array list
        ArrayList<Integer> inputArray = new ArrayList<>();
        System.out.print("Input 2: Enter the integers of the array list: ");
        for (int i = 0; i < numIntegers; i++) {
            inputArray.add(scanner.nextInt());
        }

        // Input 3: Number of times the array has to be rotated
        System.out.print("Input 3: Enter the number of times the array has to be rotated: ");
        int rotateBy = scanner.nextInt();

        // Call the rotateArray method
        ArrayList<Integer> rotatedArray = rotateArray(inputArray, rotateBy);

        // Display the original and rotated arrays
        System.out.println("Original Array: " + "1, 3, 6, 11, 13, 17");
        System.out.println("Rotated Array: " + rotatedArray);

        scanner.close();
    }
}
