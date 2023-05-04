package app;

public class Main {

	public static void main(String[] args) {
//		int x = 10, y = 20;
//
//		boolean test = true;
//
//		if (test) {
//			System.out.println("Test passato");
//		} else {
//			System.out.println("Test non passato");
//		}
//
//		if (x > y) {
//			System.out.println("X maggiore di Y");
//		} else if (x == 10) {
//			System.out.println("X uguale a 10");
//		} else {
//			System.out.println("X non è maggiore di Y o uguale a 10");
//		}
//
//		if (y % 2 == 0) {
//			System.out.println("Il numero è pari");
//		}
//
//		System.out.println(x <= y ? "minore" : "maggiore");
//
//		System.out.println(getValue(10, 20, 30));

//		String favouriteColour = "red";
//		switch (favouriteColour) {
//		case "red": {
//			System.out.println("Il colore è rosso");
//			break;
//		}
//		case "blue": {
//			System.out.println("Il colore è blue");
//			break;
//		}
//		case "green": {
//			System.out.println("Il colore è verde");
//			break;
//		}
//		default:
//			System.out.println("Nessuno dei precedenti");
//		}

//		int x = 10, y = 20;
//		int z = (x > y) ? -100 : 123;
//
//		switch (z) {
//		default:
//			System.out.println("red");
//			--x;
//			break;
//		case 30:
//			x++;
//			break;
//		case -100:
//			System.out.println("blue");
//		case 100:
//			System.out.println("green");
//			--x;
//			// break;
//		case 1000:
//			System.out.println("black");
//		}
//
//		System.out.println(x);

		// *********************************** LOOPS
		// ***************************************

		int x = 6, y = 3;

//		while (y <= x + 6) {
//			System.out.println(y);
//			y += 3;
//		}

//		do {
//			System.out.println(x++);
//		} while (x < 10);

//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0)
//				continue;
//			System.out.println(i);
//		}

//		for (int i = 1; i <= 10; i++) {
//			if (i == 5)
//				break;
//			System.out.println(i);
//		}

	}

	static int getValue(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c); // NON ABUSARE DEL TERNARY OPERATOR
	}

}
