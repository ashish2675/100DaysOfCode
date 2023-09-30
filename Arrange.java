package accentureQ;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrange {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(9);
        list.add(45);
        list.add(2);
        list.add(10);
        list.add(10);
        list.add(45);
        System.out.println( evenOdd(list));
        int [] arr = new int[]{12, 10, 9, 45, 2, 10, 10, 45};
        System.out.println(Arrays.toString(evenOdd2(arr)));

    }

    private static ArrayList<Integer> evenOdd(ArrayList<Integer> list){
        if(list.isEmpty()){
            System.out.println("null");
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i<list.size(); i++){
            if(list.get(i)%2 == 0){
                even.add(list.get(i));
            }
            else {
                odd.add(list.get(i));
            }
        }
            res.addAll(even);
            res.addAll(odd);
        return res;
    }

    // Easy method
    public static int[] evenOdd2(int []arr){
        int l =0;
        int r = arr.length-1;

        while(l<r){
            if(arr[l]%2 !=0){
                swap(arr, l, r);
                r--;
            }else {
                l++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
