package test;

public class oil extends Car{
	int oilamount;
	oil(){
		oilamount = 5;
	}
	void LeftOil(){
		System.out.println("남은오일 : "+oilamount);
	}
}
