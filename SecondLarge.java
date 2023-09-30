package accentureQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLarge {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1, 7, 5, 4};
        System.out.println(large(arr));
    }



    static int large(int[]arr){
        if(arr.length == 0 || arr.length <= 3){
            return 0;
        }
        List<Integer> even = new ArrayList<>(arr.length/2);
        List<Integer> odd = new ArrayList<>(arr.length/2);
//        int [] even = new int[arr.length/2];
//        int [] odd = new int[arr.length/2];

        for (int i =0; i<arr.length; i++){
            if(i%2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        int res = even.get(even.size()-2) + odd.get(odd.size()-2);
        return res;
    }
}
