
public class Test0407_4 {

	public static void main(String[] args) {
		double d1 = 10.776;
		// ���� ���ڸ� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ����
		int result = (int) (d1 + 0.5);
		System.out.println("result:" + result);

		// �Ҽ� ù° �ڸ� �ø�
		// �������絥���Ͱ���-1 / �������絥���Ͱ���
		int count = 113;
		double pageCnt = 10.0;
		result = (int) (count / pageCnt + (pageCnt - 1) / pageCnt);
		System.out.println("result:" + result);

		// short�� -32768 ~ 32767���� ���� ����
		short s1 = (short) 32768;
		System.out.println("short:" + s1);
	}

}
