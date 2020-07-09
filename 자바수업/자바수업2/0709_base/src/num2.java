import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		int a;
		System.out.println("정수를 입력하세요 : ");
		Scanner in  = new Scanner(System.in);
		a = in.nextInt();
		if(a  % 2==0) {
			System.out.println("짝수입니다.");
		}
		else
			System.out.println("홀수입니다.");
		
	}

}
