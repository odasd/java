package ex05;

import java.util.Scanner;

public class Sample {
	// 메-인
	public static void main(String[] args) { //프로젝트 시작은 메인메소드에서 시작함
		//switch1(); //()가 있으면 메소드
		sungjuk(); // 메소드  순서는 메인 메소드에 적힌 순서대로 실행됨
		//sungjuk1();

	}
	//학점 구하기
	public static void sungjuk1() {
		Scanner s=new Scanner(System.in);//키보드 입력
		System.out.println("점수>");
		int score=s.nextInt();
		if(score>=90) {
			System.out.println("학점은 A");
			
		}else if(score>=80) {
			System.out.println("학점은 B");
		}
	}
	
	//-------------------------------
	public static void sungjuk() {
		System.out.println("----성적계산----");
		Scanner scanner=new Scanner(System.in);
		System.out.println("국어>");
		int kor=scanner.nextInt();
		System.out.println("수학>");
		int mat=scanner.nextInt();
		System.out.println("영어>");
		int eng=scanner.nextInt();
		
		int tot=kor+mat+eng;
		System.out.println("총점 = " + tot);
		double avg=(double)tot/3;
		System.out.println("평균점수 = " + avg);
		
		// 학점ㅋㅋ
	}
	
	public static void switch1() {
		System.out.println("switch 예제1");
		Scanner scanner=new Scanner(System.in);
		System.out.print("시간입력>");
		int time=scanner.nextInt();//키보드에서 데이터입력받을수 있음
		
		switch(time) {                    
		case 9 : 
			System.out.println("회의를 합니다.");
			break;
		case 8 :
			System.out.println("출근을 합니다.");
			break;
		case 10 :
			System.out.println("업무를 봅니다.");
			break;
		default :
			System.out.println("외근을 합니다.");
			//default 뒤에는 break 생략 가능
		}
		
	}                                      
	
}

//스위치1 메소드를 실행시키기 위해서는 메인메소드에 스위치1이라는 메소드 이름을 적어야함
//메인메소드에 스위치1이라는 메소드 이름을 적어주지 않으면 실행되지 않음
//프로젝트는 메인 메소드에서 실행되기때문에 출력이 안됨
//대문자로 쓰는거는 클래쓰는 대문자로씀, intValue 같은 경우 뒤에 합쳐지는 단어는 통상 대문자로 쓰나 안써도 오류는 안남
//String은 타입이 아닌 클래스라 시작이 대문자로 기입함