
public class Test0408_2 {

	public static void main(String[] args) {
		int idx = 0;
		while(true) {
			//mod는 idx를 2로 나눈 나머지
			int mod = idx % 3;
			if(mod==0)
					System.out.println("기훈고기한점");
			else if(mod==1)
					System.out.println("성현고기한점");
			else if(mod==2)
					System.out.println("기훈고기한점");
			try {
						//2초대기
				Thread.sleep(1000);
				
			}catch(Exception e) {}
			
			idx++;
		}

	}

}
