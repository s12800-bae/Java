
public class Test0413_3 {

	public static void main(String[] args) {
		// 별개수 1,2,3,4,5
//		for(int i=0; i<=4; i=i+1) {		//i<=4; or i<5 
//			for(int j=0; j<=i; j=j+1) { //j<=i; or j<i+1;
//			System.out.print("*");
//		}
//		System.out.print("\n");
//	  }

//		//별개수 1,3,5,7,9
//		for(int i=0; i<=4; i=i+1) {		
//			for(int j=0; j<=4-i; j=j+1) { 
//			System.out.print("*");
//		}
//		System.out.print("\n");
//	  }

		// 별개수 9,7,5,3,1
//		for(int i=0; i<5; i=i+1) {		
//			for(int j=0; j<i*-2+9; j=j+1) { 
//			System.out.print("*");
//		}
//		System.out.print("\n");
//	  }
		for (int i = 0; i < 5; i = i + 1) {
			if (i < 3) {
				for (int j = 0; j < i + 1; j = j + 1) {
					System.out.print("*");

				}
				System.out.print("\n");
			}

			else {
				for (int j = 0; j < 5 - i; j = j + 1) {
					System.out.print("*");

				}
				System.out.print("\n");

			}

		}

	}
}
