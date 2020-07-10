package pt01;

import java.util.Scanner;

public class Sample {
	
	public static void method1() {
		//이름, 국어, 영어, 수학 키보드에서 입력
				//총점, 평균출력 -> 변수명부터 입력
				Scanner s=new Scanner(System.in);
				System.out.println("이름 ");
				String name=s.next();
				
				System.out.println("국어");
				int kor=s.nextInt();
				
				System.out.println("영어 ");
				int eng=s.nextInt();
				
				System.out.println("수학 ");
				int mat=s.nextInt();
				
				int tot=kor+eng+mat;
				System.out.println("총점\n" + tot);
				
				double avg=tot/3.;
				System.out.println("평균점수\n" + avg);
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();

	}
	public static void method2() {
		//원의 반지름을 입력 받아 원의 넓이를 구할수 있다.
		//반지름이 0이면 프로그램 종료
		boolean run=true;
		while(run) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("원의 반지름= ");
			int r=s.nextInt();
			double area=r*r*3.14;
			System.out.println("원의 넓이 " + area);
			
			if(r==0) {
				System.out.println("프로그램 종료");
				run=false;
			}
		}
	}
	public static void method3() {
		//삼각형의 높이와 밑변을 키보드에서 입력받는다.
		//삼각형의 넓이를 구하여 출력한다.
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
			System.out.println("삼각형의 넓이를 원하냐(y/n)?");
			String q=s.next();
			if(q.equals("Y") || q.equals("y")) {
				System.out.println("높이");
				int h=s.nextInt();
				System.out.println("밑변");
				int w=s.nextInt();
				double area=(double)h*w*1/2.;
				System.out.println("삼각형의 넓이 " + area);
			} else if(q.equals("N") || q.equals("n")) {
				System.out.println("프로그램 종료");
				run=false;
			} else {
				System.out.println("다시쓰세요~");
			}
		}
	}
}
