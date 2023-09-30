import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
    max_no();
    }
    static void max_no() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second no: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third no: ");
        int num3 = sc.nextInt();

        if (num1>num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest");
        } else if (num2>num3 && num2>num1) {
            System.out.println(num2 + " is the greatest");
        }
        else
            System.out.println(num3 + " is the greatest");
    }


}
