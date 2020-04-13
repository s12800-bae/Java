import java.util.Scanner;

public class Test0413_1extra3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < 7; i++) {
				System.out.println("1~45 숫자를 입력해주세요. : ");
				int num = sc.nextInt();
				if((num<1||num>45)) {
					System.out.println("숫자입력이 잘못되었습니다.");
					i = i - 1;
					continue;
				}
				System.out.println(i+"번째숫자가 정확히 입력되었습니다.");	
	}
		System.out.println("종료");
}
}