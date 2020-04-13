
public class Test0409_1 {

	public static void main(String[] args) {
		int a = 10, b = 20;   int max, min;
		//a의 값이 크다면 a 그렇지 않으면 b
		int result = a>b ? a:b;
		System.out.println("결과:" + result);
//		a > b ? a : b; (이문장이 있으면 오류나옴 확인요망)
		// 위의 문장은 3항연산자이다.
		// a>b를 비교후 true면 앞에 a를 false면 뒤에 b를 출력한다.
//		max = a > b ? a : b;
//		min = a < b ? a : b;
//		System.out.println("두 수 중 큰 값:" + max);
//		System.out.println("두 수 중 작은 값:" + min); 
		
		String w1 = "콜라";
		String w2 = "사이다";
		//2개의 내용물을 swap
		// 빈 컵을 만들고 콜라를 대입
		String temp = w1;
		//콜라가 들어있던 컵에 사이다를 대입
		w1 = w2;
		//사이다가 들어있던 컵에 콜라를 대입
		w2 = temp;
		
		System.out.println("w1:" + w1);
		System.out.println("w2:" + w2);
	

	}

}
