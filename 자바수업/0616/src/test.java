import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  Consumer<String> consumer = t -> System.out.println(t + "8");
//	
//		MyConsumer c1 = < -> {
//
//			System.out.println("��� : " + txt);
//
//		};

//		c1.accept("ȫ�浿");
		Consumer c2 = (txt) -> System.out.println("��� : " + txt);

		c2.accept("ȫ�浿");

		
	}
	
}
interface Consumer{
	void accept(String a);
}

