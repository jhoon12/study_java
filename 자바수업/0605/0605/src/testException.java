
public class testException {
	public static void main(String[] args) {
		try {
			method();
		}catch(ClassNotFoundException e){
			System.out.println("클래스 못찾음");
		}
}
			
	static void method() throws ClassNotFoundException{
		
		Class c = Class.forName("java.lang.String2");
	}	
	

	}
