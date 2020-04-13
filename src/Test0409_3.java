
public class Test0409_3 {

	public static void main(String[] args) {

//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		//아래 문장은 없어도 되지만 확인을 하기위해 넣어주는게 좋다.
//		System.out.println("점수 입력: ");
//		int score = sc.nextInt();
//		//아래 문장(입력개체)처럼 닫아주는 문장은 스캐너 문장이 끝나면 넣어준다.
//		sc.close();
//		if(score>=60) {
//			//테스트를 할때는 경계에 있는 59,60,61을 넣어서 테스트하는게 좋다.
//				System.out.print("합격 ");
//		}
//				System.out.println("종료 ");
//		
//		//아래 문장(입력개체)처럼 닫아주는 문장은 끝나면 넣어준다.
//		sc.close();

		// 아래 문장 추가 예제
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("아이디 입력: ");
//		String id = sc.nextLine();
//		System.out.print("비밀번호 입력: ");
//		String pw = sc.nextLine();
//		if ("root".equals(id) && "system".equals(pw)) {
//			System.out.println("로그인 하셨습니다.");
//
//		} else {
//			System.out.println("입력하신 정보가 틀립니다.");
//			sc.close();
//		}
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String pw = sc.nextLine();
		if ("root".equals(id) && "system".equals(pw)) {
			System.out.println("로그인 하셨습니다.");

		} else if("root".equals(id) && !"system".equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(!"root".equals(id) && "system".equals(pw)) {
				System.out.println("아이디가 틀렸습니다.");
		}else {
			    	System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
			    }
				
		}
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("나이 입력: ");
//		int age = sc.nextInt();
//		if (age>=60) {
//			System.out.println("노년");
//
//		} else if(age>=40) {
//			System.out.println("장년");
//		} else if(age>=20) {
//				System.out.println("청년");
//		} else {
//			    	System.out.println("청소년");
//			    }
//		sc.close();
		}
	