
public class Test0413_3extra {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i = i + 1) {
			if (i < 3) {
				for (int j = 0; j < 2 * i + 1; j = j + 1) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < 8 - 2 * i + 1; j = j + 1) {
					System.out.print("*");
				}

			}
			System.out.print("\n");
		}

	}
}