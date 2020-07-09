import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		double w, h, area;
		Scanner in  = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		area = h*w;
		System.out.println(area);
	}

}
