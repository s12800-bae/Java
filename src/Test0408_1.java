
public class Test0408_1 {

	public static void main(String[] args) {
		int a = 0;
		int result = ++a + ++a;
		System.out.println("result:" + result);
		//����� 3
		//�Ǿտ� a�� �̹� 1�������Ѽ� �ڿ� a�� �̹� 1�� �����������ְ�
		//�׷��Ƿ� �ڿ� a�� 2�� �ȴ�
		int b = 0;
		int temp1 = b++;
		int temp2 = b++;
		int result1 = temp1 + temp2;
		System.out.println("result1:" + result1);
	}

}
