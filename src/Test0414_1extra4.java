
public class Test0414_1extra4 {

	public static void main(String[] args) {
		int[][] ar = { { 20, 30, 10 }, { 59, 34, 76 } };

		// 전체 합계를 저장할 변수
		int sum = 0;
		// 행의 합계를 저장할 배열
		// sumRow[0], sumRow[1] 은 모두 0
		// 배열을 생성하고 데이터를 대입하지 않으면
		// 0(숫자), false(boolean), null(문자열)
		int[] sumRow = new int[ar.length];
		// 열의 합계를 저장할 배열
		int[] sumCol = new int[ar[0].length];

		// 전체 데이터 합계
		// 전체 데이터를 순회하면서 데이터를 sum에 더하면 됩니다.
		// 전체 데이터가 6개이고 2행 3열인 경우에
		// 하나의 반복문으로 전체 데이터를 접근
		for (int i = 0; i < 6; i = i + 1) {
			// 행번호는 열의 개수로 나눈 몫
			// 열번호는 열의 개수로 나눈 나머지
			sum = sum + ar[i / 3][i % 3];
		}
		System.out.println("합계 : " + sum);
		
		//행 단위 합계 구하기
		//하나의 행을 열 번호를 변경해가면서 접근하도록 하고
		//그 데이터들을 행의 합계에 저장
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sumRow[i] = sumRow[i] + ar[i][j];
				
			}
		}
		System.out.println("행의 합계 출력");
		
		//행의 합계 배열의 내용을 출력
		int len = sumRow.length;
		for (int i = 0; i < len; i++) {
			System.out.println(sumRow[i]);
		}
		System.out.println("===================");
		//열 단위 합계 구하기
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 2; i++) {
				sumCol[j] = sumCol[j] + ar[i][j];
			}
		}
		System.out.println("열의 합계 출력");
		for (int i = 0; i < sumCol.length; i++) {
			System.out.println(sumCol[i]);
			
		}
	}

}
