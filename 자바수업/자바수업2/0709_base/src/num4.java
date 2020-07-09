
public class num4 {

	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
class Printer{
	private int numOFPapers;
	private boolean duplex;

	void print(int amount) {
		if (this.duplex == true) {
			amount /= 2;
			amount++;
			numOFPapers -= amount;
			System.out.println("양면으로" + amount + "장 출력했습니다. 현재" + this.numOFPapers + "장 남아있습니다.");
		} else if (this.duplex == false) {
			if (amount > numOFPapers) {
				int re = amount - numOFPapers;
				System.out.println("단면으로 모두 출력하려면 용지가" + re + "매 부족합니다." + this.numOFPapers + "장만 출력합니다");
			}

		}
		
//		if(amount > numOFPapers) {
//			int reduce= amount-numOFPapers;
//			System.out.println("모두 출력하려면 용지가 "+reduce+"매 부족합니다."+numOFPapers+"장만 출력합니다.");
//		}
//		else if(amount == numOFPapers) {
//			System.out.println("용지가 없습니다.");
//		}
//		else
//		System.out.println(amount+"장을 출력했습니다. 현재 "+numOFPapers+"장 남아있습니다.");
	}
	public boolean getDuplex() {return duplex;};
	public  void setDuplex(boolean duplex){
		this.duplex = duplex;
	}
	

	Printer(int numOFPapers, boolean duplex){
		this.numOFPapers = numOFPapers;
		this.duplex = duplex;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	void add(int Add) {
		System.out.println("프린터에 용지 "+Add+"장을 추가한다");
	}
	void left(int amount, int add) {
		System.out.println("프린터에 남아있는 용지를 조사한다");
		System.out.println(amount - add);
	}
}
