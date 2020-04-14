
public class Test0414_1extra5 {

	public static void main(String[] args) {
		int[] ar = new int[20];
		// 1부터 20까지 숫자로 배열의 값을 대입
		for (int i = 0; i < 20; i++) {
			ar[i] = i + 1;
		}
		// 데이터 출력
		// 한줄에 5개씩 출력
		for (int i = 0; i < 20; i++) {
			System.out.printf("%3d\t", ar[i]);
			if(i %5 ==4) {
				System.out.printf("\n");
			}
		}
	}

}
