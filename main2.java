
public class main2 {

	public static void main(String[] args) {
	

		Data test = new Data();
		
		test.add(1);
		test.add(9);
		test.add(4);
		test.add(5);
		test.add(10);
		test.add(0);
		
		
		int a = test.getValue(0);
		int b = test.getValue(3);
		
		System.out.println(a);
		System.out.println(b);

	}

}
