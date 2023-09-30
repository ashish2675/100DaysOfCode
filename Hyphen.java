package accentureQ;

import java.util.Scanner;

public class Hyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String hyphen = "";
        String letters = "";


        for (int i =0; i<str.length(); i++){
            if(str.charAt(i) == '-') hyphen += str.charAt(i);
            else letters += str.charAt(i);
        }
        System.out.println(hyphen + letters);
    }
}
