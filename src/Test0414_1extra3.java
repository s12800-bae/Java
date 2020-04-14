
public class Test0414_1extra3 {

	public static void main(String[] args) {
		// 2행 3열 짜리 배열 만들기
		int[][] ar = { { 20, 30, 10 }, { 59, 34, 76 } };

		// 배열 요소 1개에 접근 : 배열이름[행번호][열번호]
		// 1행 2열의 데이터 출력
		System.out.println(ar[1][2]);
		// 데이터 개수 파악
		System.out.println("ar:" + ar.length);
		System.out.println("ar[0]:" + ar[0].length);

		// 모든 데이터를 열 우선으로 접근
		// 행의 개수 찾기
		int cntRow = ar.length;
		for (int i = 0; i < cntRow; i++) {
			// 각 행에 해당하는 배열의 데이터 개수 찾기(열 개수)
			int cntCol = ar[i].length;
			for (int j = 0; j < cntCol; j++) {
				System.out.println(ar[i][j]);
			}

		}
		System.out.println("======================");
		int cntCol = ar[0].length;
		// 2개의 반복문이 있는 경우 순서를 바꾸면 행과 열이 교체
		for (int j = 0; j < cntCol; j++) {
			for (int i = 0; i < cntRow; i++) {
				System.out.println(ar[i][j]);
			}
		}
		System.out.println("==========구구단==========");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				//printf는 서식을 적용해서 데이터를 서식에 맞게 출력해주는 메소드
				System.out.printf("%2d*%2d=%2d", j,i, i*j );
				
			}
			System.out.println("\n");
		}
		System.out.println("==========구구단1==========");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				//printf는 서식을 적용해서 데이터를 서식에 맞게 출력해주는 메소드
				System.out.printf("%2d*%2d=%2d", i,j, i*j);
				
			}
			
			System.out.println("\n");
		}
		
	}

}
