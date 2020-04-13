
public class Test0413_3extra4 {

	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0; i<5; i=i+1) {
			
			for (int j = 0; j < 4-i; j++) {
				          System.out.print("W");
			}
			for (int j = 0; j <i+1; j++) {
				  System.out.print(num++%10);
			}
			
			System.out.print("\n");
		}

	}

}
