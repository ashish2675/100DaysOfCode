package accentureQ;

public class AddDigit {
    public static void main(String[] args) {

        int n = 10;
        int arr[] = {11, 14, 16, 10, 9, 8, 24, 5, 4, 3};
        int rem1 = 0;
        int rem2 = 0;
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < n; i++) {
            sum1 +=arr[i];
        }
        for (int i = 0; i < n; i++) {
            int sum3 = 0;
            while (arr[i]>0){
                sum3 += arr[i]%10;
                arr[i] /=10;
            }
            sum2 += sum3;
        }

        rem1 = sum1%10;
        rem2 = sum2%10;

        int res = rem2 -rem1;
        System.out.println(res);


    }
}
