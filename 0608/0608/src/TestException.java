
public class TestException {
	public static void main(String[] args) {
//		int []a = {1,2};
//		try {
//			a[3] = 5;
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//		 e.printStackTrace();
//		}
		
//		2.
//		Object obj1 = new Object();
//
//		Object obj2 = new Object();
//
//		boolean result = obj1.equals(obj2);
//		System.out.println(result);
		String s = new String("h1");
		String s2 = new String("h1");
		boolean b = s.contentEquals(s2);
		System.out.println(b);
	}
}
