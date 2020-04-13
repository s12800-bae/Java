import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test0413_1 {

	public static void main(String[] args) {
		//1부터 10까지 반복문을 이용해서 출력
		//if문을 이용해서 해보기
		//왼쪽세번 오른쪽세번 출력해보기
//		for(int idx= 1; idx < 11; idx = idx+1) {
//			//나머지를 구하면 값이 제한이 된다.
//				System.out.println(idx%2-1);
//			
//			try {
//				Thread.sleep(1000);
//				
//			}catch(Exception e) {}
//		}
		
		for(int idx= 0; idx < 10; idx = idx+1) {
			//0,0,1,1 반복
			int mok = idx / 2;   //0,0,1,1,2,2,3,3,4,4
			//나머지를 구하면 값이 제한이 된다.
			int nmg = mok % 2;
				System.out.println(nmg);
			
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {}
		}

	}

}
