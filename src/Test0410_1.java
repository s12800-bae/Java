
public class Test0410_1 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�ֹ����(1.�����ֹ� 2.����ֹ� 3.�� 4.��Ÿ) :");
		String order = sc.nextLine();

		final String STORE = "1";
		final String TABLET= "2";
		final String APP   = "3";
		final String ETC   = "4";

		switch (order) {
		case STORE:
			System.out.print("�����ֹ�");
			break;

		case TABLET:
			System.out.print("����ֹ�");
			break;

		case APP:
			System.out.print("�� �ֹ�");
			break;

		case ETC:
			System.out.print("��Ÿ �ֹ�");
			break;
		default:
			System.out.print("�߸��� �ֹ����");

		}
		sc.close();
	}

}
