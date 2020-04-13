
public class Test0408_5 {

	public static void main(String[] args) {
		String msg = "java";
		System.out.println(msg == "java");
		System.out.println(msg.equals("java"));
	
		java.util.Scanner sc =
			new java.util.Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println(name == "java");
		System.out.println(name.equals("java"));
	}

}
