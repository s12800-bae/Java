
public class Test0410_3extra1 {

	public static void main(String[] args) {
		int [] ar = {700,600,500,430};
		int i = 0;
		int sum = 0;
		do {
			sum= sum + ar[i];
			i = 1 + i;
			
	}
		while (i<4);
			System.out.println("합계: "+ sum);
			
		double avg = sum;
		//1. 평균 구하기	
		System.out.println("평균: "+ avg/4.0);
		// 2. 반올림 원하는 자리수의 값을 소수점 첫번째자리로 보낸다.
		System.out.println("평균: "+ (avg/4.0)/100);
		//	3. 그리고 0.5를 더해서 반올림해준다.
		System.out.println("평균: "+ (((avg/4.0)/100)+0.5));
		//4. 인트형으로 형변환한다.
		System.out.println("평균: "+ (int)(((avg/4.0)/100)+0.5));
		//5. 곱하기 또는 나누기를 해서 원하는 자리수만큼 곱하거나 나누어준다.	
		System.out.println("평균: "+ ((int)(((avg/4.0)/100)+0.5)*100));

			/* 순서.
			  1. 평균구하기
			  2. 반올림 원하는 자리수의 값을 소수점 첫번째자리로 보낸다.
			  3. 그리고 0.5를 더해서 반올림해준다.
			  4. 인트형으로 변환한다.
			  5. 곱하기 또는 나누기를 해서 원하는 자리수만큼 곱하거나 나누어준다.
			 */
			//System.out.println("평균을 소수 첫째자리로 보내게되면: "+(int)((avg/4.0)/100)+0.5);
			//System.out.println("평균 10의 자리 반올림 값은: "+(int)(((avg/4.0)/100)+0.5)*100);
	
	
	}

}
