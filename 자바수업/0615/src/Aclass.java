
interface B{
		public void run();
	}
	
public class Aclass {
	public static void main(String[] args) {
		B b = () -> {System.out.println("아무것도없어용");};
//		System.out.println(b.run(5, 7));
//		b = (x,y) -> x+y;
//		System.out.println(b.run(5, 5));
//		b = (x,y) -> sum(x,y);
//		System.out.println(b.run(3, 2));
	}
	public static int sum(int x, int y) {
		return x+y;
	}
}
