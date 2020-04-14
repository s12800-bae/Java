
public class Test0413_4_homework1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 0; j < 2 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
			}

			System.out.print("\n");
		}

	}

}
