package accentureQ;
import java.util.Scanner;


//public class Bulb {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        // Initialize all bulbs as on (1)
//        for (int i = 0; i < n; i++) {
//            arr[i] = 1;
//        }
//
//        // Perform bulb toggling rounds
//        for (int i = 2; i <= n; i++) {
//            for (int j = i - 1; j < n; j += i) {
//                arr[j] = 1 - arr[j]; // Toggle the bulb
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 1) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//}


// 2nd Method

public class Bulb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println((int)Math.sqrt(n));
    }
}