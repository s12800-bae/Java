
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
		
		System.out.println("�հ�: " +sum );
		
		double avg = sum/ 6.0;
		System.out.println("���: " +avg );
		//�ݿø��� �ڸ��� �Ҽ� ù°�ڸ��� ������ + 0.5
		avg = avg * 10+ 0.5;
		System.out.println("���: " +avg );
		avg= (int)avg;
		System.out.println("���: " +avg );
		//��Ʈ������ ����ȯ������ ������ �������̹Ƿ� 413.0�� ���´�.
		avg= avg/10;
		System.out.println("���: " +avg );
		
		
		
		
	}


	}


