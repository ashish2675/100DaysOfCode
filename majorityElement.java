import java.io.*;

class majorityElement {


    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }


            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }


        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }


    public static void main(String[] args)
    {

        int arr[] = { 1, 2, 3, 4, 2, 2, 2 };
        int n = arr.length;

        findMajority(arr, n);
    }
}
