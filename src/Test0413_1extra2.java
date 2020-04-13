import java.util.Scanner;

public class Test0413_1extra2 {

	public static void main(String[] args) {
		//root가 아닌 데이터를 입력할 때까지 계속 입력받기
		Scanner sc = new Scanner(System.in);
		
		//무한반복을 만들때는 아래문장을 사용
		while(true) {
			System.out.println("아이디 입력:");
			String id = sc.nextLine();
			if(id.equals("root")==false) {
				break;
			}
			System.out.println("존재하는 아이디");

		}
		
		System.out.println("사용 가능한 아이디");
		//스캐너 사용 종료(스캐너사용종료하면 다시는 사용안됌 그래서 맨마지막에 배치)
		sc.close();	
	}

}
