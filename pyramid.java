package accentureQ;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        formPyramid(1);
    }

    static void formPyramid(int n){
        int count = 0;
        for(int i=n; i>0 ; i--){
            count += i *2;
        }
        if(n == 1){
//            return;
        }else if(n == 2){
            count += 1;
        } else if (n>=3) {
            for (int i=2; i <n; i++) {
                count += 3;
            }

        }
        System.out.println(count);
    }
}
