
public class Test0408_2 {

	public static void main(String[] args) {
		int idx = 0;
		while(true) {
			//mod�� idx�� 2�� ���� ������
			int mod = idx % 3;
			if(mod==0)
					System.out.println("���ư������");
			else if(mod==1)
					System.out.println("�����������");
			else if(mod==2)
					System.out.println("���ư������");
			try {
						//2�ʴ��
				Thread.sleep(1000);
				
			}catch(Exception e) {}
			
			idx++;
		}

	}

}
