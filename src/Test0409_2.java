
public class Test0409_2 {

	public static void main(String[] args) {
		//Ű���� �Է� ��ü �����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//���� �Է¹ޱ�
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		//���ۿ� �����ִ� ������ ���ֱ� ���ؼ� nextLine�� ȣ��
		sc.nextLine();
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
//		System.out.print("���� �Է�: ");
//		int score = sc.nextInt();
		System.out.println(name + ":" + score );
		
		//������� - ��������
		sc.close();
		
	}

}
