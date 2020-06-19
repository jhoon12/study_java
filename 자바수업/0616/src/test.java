//import java.util.function.BiConsumer;
//import java.util.function.Consumer;
//import java.util.function.DoubleConsumer;
//import java.util.function.ObjIntConsumer;
//
//public class test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		  Consumer<String> consumer = t -> System.out.println(t + "8");
////	
////		MyConsumer c1 = < -> {
////
////			System.out.println("결과 : " + txt);
////
////		};
//
////		c1.accept("홍길동");
//		Consumer c2 = (txt) -> System.out.println("결과 : " + txt);
//
//		c2.accept("홍길동");
//
//		
//	}
//	
//}
//interface Consumer{
//	void accept(String a);
//}
//
public class test{
	public static void main(String[] args) {
		 Consumer<String> consumer = t -> System.out.println(t + "8");
	        consumer.accept("자바");

	}
}