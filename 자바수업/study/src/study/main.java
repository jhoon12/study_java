package study;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}

}
