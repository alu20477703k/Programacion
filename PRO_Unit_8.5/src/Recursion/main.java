package Recursion;

public class main {

	public static void main(String[] args) {

		System.out.println("Fibonacci: " + fibonacci(8));

	}

	private static int fibonacci(int n) {
		if (n == 1 || n==2)
			return 1;
		else {
			return (fibonacci(n - 1) + fibonacci(n - 2));
		}
	}

}
