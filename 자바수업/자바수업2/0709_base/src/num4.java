
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
			System.out.println("�������" + amount + "�� ����߽��ϴ�. ����" + this.numOFPapers + "�� �����ֽ��ϴ�.");
		} else if (this.duplex == false) {
			if (amount > numOFPapers) {
				int re = amount - numOFPapers;
				System.out.println("�ܸ����� ��� ����Ϸ��� ������" + re + "�� �����մϴ�." + this.numOFPapers + "�常 ����մϴ�");
			}

		}
		
//		if(amount > numOFPapers) {
//			int reduce= amount-numOFPapers;
//			System.out.println("��� ����Ϸ��� ������ "+reduce+"�� �����մϴ�."+numOFPapers+"�常 ����մϴ�.");
//		}
//		else if(amount == numOFPapers) {
//			System.out.println("������ �����ϴ�.");
//		}
//		else
//		System.out.println(amount+"���� ����߽��ϴ�. ���� "+numOFPapers+"�� �����ֽ��ϴ�.");
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
		System.out.println("�����Ϳ� ���� "+Add+"���� �߰��Ѵ�");
	}
	void left(int amount, int add) {
		System.out.println("�����Ϳ� �����ִ� ������ �����Ѵ�");
		System.out.println(amount - add);
	}
}
