interface Fi {
	int run(int a, int b);
}


public class Main {
	
	Fi f = new Fi() {
		public int run(int a, int b) {
			return a+b;
		};
	};
	Fi f2 = (a, b)->a+b;
	
	public static void main(String[] args) {
	
		Main m = new Main();
		m.f.run(10, 20);
		

//		Fi f = new Fi() {
//			public int run(int a, int b) {
//				return a+b;
//			};
//		};
//		Fi f2 = (a, b)->a+b;
		
//		System.out.println(f.run(10, 20));
//		System.out.println(f2.run(0, 20));
	}
}
