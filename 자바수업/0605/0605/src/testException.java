
public class testException {
	public static void main(String[] args) {
		try {
			method();
		}catch(ClassNotFoundException e){
			System.out.println("Ŭ���� ��ã��");
		}
}
			
	static void method() throws ClassNotFoundException{
		
		Class c = Class.forName("java.lang.String2");
	}	
	

	}
