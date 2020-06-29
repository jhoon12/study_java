package study;

public class UsingThis {
	public int outterField = 10;
	class Inner{
		int innerField = 20;
		void method() {
			MyFuncionalInterface fi= ()->{
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField);
				
				System.out.println("outterField : " + innerField);
				System.out.println("outterField : " + this.innerField);
			};
			fi.method();
		}
		
	}
}
