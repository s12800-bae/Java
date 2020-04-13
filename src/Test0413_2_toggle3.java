import java.util.Scanner;

public class Test0413_2_toggle3 {

	public static void main(String[] args) {
		//Toggle(교번) - 2개의 상태를 번갈아가면서 변경
		//2로 나눈 나머지를 이용해도 되고
		//변수를 하나 만들어서 변수의 상태변화를 이용하기도 한다.
		
		//Enter를 누를 때 마다 ON과 OFF를 수행하는 처리
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while(true) {
			System.out.println("Enter를 누르세요: ");
			sc.nextLine();
			if(flag>0) {
				System.out.println("ON"+flag);
			}else {
				System.out.println("OFF"+flag);
			}
			flag= -flag;
			
		}
				
	}

}
