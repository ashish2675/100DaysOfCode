import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		// int high = 0;
		// for(int i =0; i< arr.length()-1; i++){
		// 	for(int j = i+1; i<arr.length(); j++){
		// 		if(arr(i)<arr(j))
		// 	}
		// }
		// int i = 1;
		Arrays.sort(arr);
		if(arr[0] == arr[arr.length-1]){
			return -1;
		}else if(arr[arr.length-2] == arr[arr.length -1] || arr[arr.length-2] == arr[arr.length-3]){
			return arr[arr.length-3];
		}
		else
		return arr[arr.length-2];
	}
}
