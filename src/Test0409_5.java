
public class Test0409_5 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���� �Է�(0~100) :");
		int score = sc.nextInt();
		if (score >= 80 && score <= 100) {
			System.out.println("���");
		} else if (score >= 60 && score <= 79) {
			System.out.println("����");
		} else if (score <= 59 && score >= 0) {
			System.out.println("����");
		} else {
			System.out.println("�߸��� ����");
		}

	}
}