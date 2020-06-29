package t1;

interface a<T> {
	T run( T a);

}

public class test3 {
	public  static void main(String[] args) {
			
	};
};

public class Box<T>{
	private T t;
	
	public T get() {
		return this.t;
	}
	public void set(T t) {
		this.t = t;
	}
}

