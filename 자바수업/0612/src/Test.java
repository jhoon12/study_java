
public class Test {


	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("Java Oracle");

		System.out.println("원본 문자열 : " + str);

		System.out.println(str.delete(4, 8));//javacle
		
		str.append(" world");
		
		System.out.println(str);
		
		int size = str.capacity();
		
		System.out.println("버퍼크기는" + size);
	}
}


