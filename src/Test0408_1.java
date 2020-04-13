
public class Test0408_1 {

	public static void main(String[] args) {
		int a = 0;
		int result = ++a + ++a;
		System.out.println("result:" + result);
		//결과는 3
		//맨앞에 a를 이미 1증가시켜서 뒤에 a는 이미 1의 수를가지고있고
		//그러므로 뒤에 a는 2가 된다
		int b = 0;
		int temp1 = b++;
		int temp2 = b++;
		int result1 = temp1 + temp2;
		System.out.println("result1:" + result1);
	}

}
