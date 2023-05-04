package app;

public class Main {

	public static void main(String[] args) {
		int x = 40, y = 30;

		boolean test = true;

		if (test) {
			System.out.println("Test passato");
		} else {
			System.out.println("Test non passato");
		}

		if (x > y) {
			System.out.println("X maggiore di Y");
		} else if (x == 10) {
			System.out.println("X uguale a 10");
		} else {
			System.out.println("X non è maggiore di Y o uguale a 10");
		}

		if (y % 2 == 0) {
			System.out.println("Il numero è pari");
		}

		System.out.println(x <= y ? "minore" : "maggiore");

		System.out.println(getValue(10, 20, 30));
	}

	static int getValue(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c); // NON ABUSARE DEL TERNARY OPERATOR
	}

}
