
public class Test0409_1 {

	public static void main(String[] args) {
		int a = 10, b = 20;   int max, min;
		//a�� ���� ũ�ٸ� a �׷��� ������ b
		int result = a>b ? a:b;
		System.out.println("���:" + result);
//		a > b ? a : b; (�̹����� ������ �������� Ȯ�ο��)
		// ���� ������ 3�׿������̴�.
		// a>b�� ���� true�� �տ� a�� false�� �ڿ� b�� ����Ѵ�.
//		max = a > b ? a : b;
//		min = a < b ? a : b;
//		System.out.println("�� �� �� ū ��:" + max);
//		System.out.println("�� �� �� ���� ��:" + min); 
		
		String w1 = "�ݶ�";
		String w2 = "���̴�";
		//2���� ���빰�� swap
		// �� ���� ����� �ݶ� ����
		String temp = w1;
		//�ݶ� ����ִ� �ſ� ���̴ٸ� ����
		w1 = w2;
		//���̴ٰ� ����ִ� �ſ� �ݶ� ����
		w2 = temp;
		
		System.out.println("w1:" + w1);
		System.out.println("w2:" + w2);
	

	}

}
