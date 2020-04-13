
public class Test0413_1extra1 {

	public static void main(String[] args) {
//	for (int i = 0; i < 5; i++) {
//		System.out.println(i);
//		//조건이 true가 되면 break를 만나서 반복문을 종료
//		if(i == 3){
//			break;
//					
//		}
//	}

		for (int i = 0; i < 10; i++) {
			
			//조건이 true가 되면 break를 만나서 반복문을 종료
			if(i <2|| i==5){
				continue;
				
			}
			System.out.println(i);
		}

	}

}
