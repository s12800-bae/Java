
public class Test0408_6 {

	public static void main(String[] args) {
		//&&:and ||:or
		int score = 50;
		//���� ������ 60���� 100�������� Ȯ��
		System.out.println(score >= 60&& score <= 100);
		//score�� 0���� �۰ų� 100���� ū �� Ȯ��
		System.out.println(score < 0 || score > 100);
		
		//&&�� ���� ����� false�̸� ���� ��� Ȯ�� ����
		//||�� ���� ����� true�̸� ���� ��� Ȯ�� ����
		int idx=0;
		boolean result = 10 > 5 &&(idx++) >0;
		//false -> false idx -> 1
		System.out.println("result:" + result);
		System.out.println("idx:" + idx);
		System.out.println("idx:" + idx);
		
		idx= 0;
		result = 10 > 5 || (idx++) > 0;
		//true ->  idx -> 0
		System.out.println("result:" + result);
		System.out.println("idx:" + idx);
		
		
		//���� üũ
		int year = 2020;
		//year�� �������� �Ǻ�
		if(year%4 == 0 && year %100 != 0||year%400 ==0) {
			System.out.println(year + "�� ����");
		}else {
			System.out.println(year + "�� ������ �ƴ�");
			}
		System.out.println(20&13);
		System.out.println(20|13);
		System.out.println(20^13); //xor, exclusiveor
	}

}
