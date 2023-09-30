// public class gcd   
// {  
// public static void main(String[] args)   
// {  
// //x and y are the numbers to find the GCF  
// int x = 2, y = 2, gcd = 1;  
// //running loop form 1 to the smallest of both numbers  
// for(int i = 1; i <= x && i <= y; i++)  
// {  
// //returns true if b oth conditions are satisfied   
// if(x%i==0 && y%i==0)  
// //storing the variable i in the variable gcd  
// gcd = i;  
// }  
// //prints the gcd  
// System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
// }  
// }  




// A simple java program to calculate
// Euler's Totient Function
import java.io.*;

class isPrime {

	// Function to return GCD of a and b
	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	static int phi(int n)
	{
		int result = 1;
		for (int i = 2; i < n; i++)
			if (gcd(i, n) == 1)
				result++;
		return result;
	}

	public static void main(String[] args)
	{
		int n;

		for (n = 1; n <= 10; n++)
			System.out.println("phi(" + n + ") = " + phi(n));
	}
}


