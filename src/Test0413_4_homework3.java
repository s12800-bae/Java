
public class Test0413_4_homework3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i < 4) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}

		System.out.print("\n");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			if (i == i) {
				System.out.print("*");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print(" ");
			}
			if (i == i) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < 9; i++) {
			System.out.print("*");
		}
	}

}
