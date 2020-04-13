
public class Test0410_3extra {

	public static void main(String[] args) {
		int [] ar = {30,40,20,17,76,65};
		//30 -> ar[0], 40-> ar[1], 20 -> ar[2]
		int idx = 0;
		int sum = 0;
		do {
			sum= sum +ar[idx];
			idx= idx + 1;
			
		}while(idx < 6);
		
		System.out.println("합계: " +sum );
		
		double avg = sum/ 6.0;
		System.out.println("평균: " +avg );
		//반올림할 자리를 소수 첫째자리로 보내고 + 0.5
		avg = avg * 10+ 0.5;
		System.out.println("평균: " +avg );
		avg= (int)avg;
		System.out.println("평균: " +avg );
		//인트형으로 형변환하지만 본래는 더블형이므로 413.0이 나온다.
		avg= avg/10;
		System.out.println("평균: " +avg );
		
		
		
		
	}


	}


