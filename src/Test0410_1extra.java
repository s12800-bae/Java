
public class Test0410_1extra {

	public static void main(String[] args) {
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("���� ���� ����: ");
//		String day = sc.nextLine();
//
//		final String MONDAY = "������"; 
//		final String TUESDAY = "ȭ����";
//		final String WEDNESDAY = "������";
//		final String THURSDAY = "�����";
//		final String FRIDAY = "�ݿ���";
//		final String SATURDAY = "�����";
//		final String SUNDAY = "�Ͽ���";

		String Monday = "������";
		String Tuesday = "ȭ����";
		String Wednesday = "������";
		String Thursday = "�����";
		String Friday = "�ݿ���";
		String Saturday = "�����";
		String Sunday = "�Ͽ���";

		switch (Monday) {
		case "������":
			System.out.println("Monday");
			break;
		case "ȭ����":
			System.out.println("Tuesday");
			break;
		case "������":
			System.out.println("Wednesday");
			break;
		case "�����":
			System.out.println("Thursday");
			break;
		case "�ݿ���":
			System.out.println("Friday");
			break;
		case "�����":
			System.out.println("Saturday");
			break;
		case "�Ͽ���":
			System.out.println("Sunday");
			break;
		}

	}

}
