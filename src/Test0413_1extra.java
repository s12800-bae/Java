
public class Test0413_1extra {

	public static void main(String[] args) {
		//두곳에 같은 변수를 사용할수있다.
		//내가 해보면 안됨
		int x=10; 
		for (int x = 1; x < 5; x=x+1) {
			System.out.println(x);
		}
		System.out.println(x);
	}

}
