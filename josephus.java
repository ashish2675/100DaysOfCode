import java.io.*;

class josephus {

    static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else

            return (josephus(n - 1, k) + k - 1) % n + 1;
    }


    public static void main(String[] args)
    {
        int n = 10;
        int k = 3;
        System.out.println("The chosen place is "
                + josephus(n, k));
    }
}

