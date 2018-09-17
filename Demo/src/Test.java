import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		int result = Test.fact(n);
		System.out.println("hello" + result);
	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		}

		return n * fact(n - 1);
	}
}
