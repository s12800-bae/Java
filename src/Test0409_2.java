
public class Test0409_2 {

	public static void main(String[] args) {
		//키보드 입력 객체 만들기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//정수 입력받기
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		//버퍼에 남아있는 내용을 없애기 위해서 nextLine을 호출
		sc.nextLine();
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
//		System.out.print("점수 입력: ");
//		int score = sc.nextInt();
		System.out.println(name + ":" + score );
		
		//사용종료 - 연결해제
		sc.close();
		
	}

}
