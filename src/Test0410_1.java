
public class Test0410_1 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("주문방법(1.매장주문 2.기계주문 3.앱 4.기타) :");
		String order = sc.nextLine();

		final String STORE = "1";
		final String TABLET= "2";
		final String APP   = "3";
		final String ETC   = "4";

		switch (order) {
		case STORE:
			System.out.print("매장주문");
			break;

		case TABLET:
			System.out.print("기계주문");
			break;

		case APP:
			System.out.print("앱 주문");
			break;

		case ETC:
			System.out.print("기타 주문");
			break;
		default:
			System.out.print("잘못된 주문방법");

		}
		sc.close();
	}

}
