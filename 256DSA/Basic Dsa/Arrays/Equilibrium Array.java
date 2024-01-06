import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr) {
    int ls = 0;
    int rs = 0;

    // Calculate the total sum of the array
    int totalSum = 0;
    for (int num : arr) {
        totalSum += num;
    }

    // Initialize the right sum to the total sum
    rs = totalSum;

    for (int i = 0; i < arr.length; i++) {
        // Adjust the right sum by subtracting the current element
        rs -= arr[i];

        // Check if the left sum is equal to the right sum
        if (ls == rs) {
            return i;  // Found equilibrium index
        }

        // Adjust the left sum by adding the current element
        ls += arr[i];
    }

    // If no equilibrium index is found
    return -1;
}

}
