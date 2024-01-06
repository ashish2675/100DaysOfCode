import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int[] arr, int n) {
		// Write your code here.
		boolean changed = false;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] <= arr[i+1]){
				continue;
			}
			if(changed == true){
				return false;
			}	
			if (i == 0 || arr[i + 1] >= arr[i - 1]) {
				arr[i] = arr[i + 1];
			} else {
				arr[i + 1] = arr[i];
			}

			changed = true;
    
			
		}
		return true;
		
	}
}

