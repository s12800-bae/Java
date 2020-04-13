
public class Test0410_1extra {

	public static void main(String[] args) {
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("요일 영어 번역: ");
//		String day = sc.nextLine();
//
//		final String MONDAY = "월요일"; 
//		final String TUESDAY = "화요일";
//		final String WEDNESDAY = "수요일";
//		final String THURSDAY = "목요일";
//		final String FRIDAY = "금요일";
//		final String SATURDAY = "토요일";
//		final String SUNDAY = "일요일";

		String Monday = "월요일";
		String Tuesday = "화요일";
		String Wednesday = "수요일";
		String Thursday = "목요일";
		String Friday = "금요일";
		String Saturday = "토요일";
		String Sunday = "일요일";

		switch (Monday) {
		case "월요일":
			System.out.println("Monday");
			break;
		case "화요일":
			System.out.println("Tuesday");
			break;
		case "수요일":
			System.out.println("Wednesday");
			break;
		case "목요일":
			System.out.println("Thursday");
			break;
		case "금요일":
			System.out.println("Friday");
			break;
		case "토요일":
			System.out.println("Saturday");
			break;
		case "일요일":
			System.out.println("Sunday");
			break;
		}

	}

}
