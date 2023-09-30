package accentureQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter low");
        int low = sc.nextInt();
        System.out.println("Enter high");
        int high = sc.nextInt();

        int same = 0;

        for(int i = low; i<high; i++){
            same = i;
            int flip=0;
            while (same>0){
                flip = flip*10  + same%10;
                same = same/10;
            }
            if(flip == i) System.out.print(i + " ");

        }



    }
}
