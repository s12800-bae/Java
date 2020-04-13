
public class Test0408_4 {

	public static void main(String[] args) {
		int n = 23;
		// << : 한번 할 때 마다 2배씩 증가
		System.out.println("23<<2:" + (n<<2));
		// 32번 이상 하라고 하면 32로 나눈 나머지 만큼만 수행
		System.out.println("23<<35:" + (n<<35));
		// >> : 한 번 할 때 마다 나누기 2를 한 효과
		System.out.println("23>>2:" + (n>>2));
		System.out.println("Hello.".equals("Hello"));
	}

}
