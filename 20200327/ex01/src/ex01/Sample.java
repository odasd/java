package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	/*	//변수타입
		int intNum1=10, intNum2=20;
		double dbNum1=10.3, dbNum2=20.4;
		char chr1='a', chr2='b';
		
		String  str1="홍길동" , str2="홍길동"; // 참조변수 스택의 str1과 str2는 힙에 저장된 값이 같아서 같다고 함
		String str3=new String("홍길동");		// 저장된 데이터를 비교하는게 아니라 저장된 주소를 비교함
		String[] strArray= {"홍길동", "임올"};				//위 3개는 참조타입
		
		if(strArray[0].equals(str1)) {  //변수안의 내용비교는 .equals()의 형식
			System.out.println("같다.");
		} else {
			System.out.println("같지않다");
		}
		
		
		
		if(str1==str2) {
			System.out.println("같다.");
		} else {
			System.out.println("같지않다.");
		}
		
		if(str1.equals(str3)) {				//문자열(String) 비교는 equals가 좋음
			System.out.println("같다.");
		} else {
			System.out.println("같지않다.");
		}
		
		System.out.println("intNum1 "+intNum1);
		
		//연산자
		//1. 산술연산자(+,-,*,/)
		int intResult1=intNum1+intNum2;
		System.out.println("intNum1+intNum2= " + intResult1);
		double dbResult2=(int)dbNum1+(int)dbNum2;
		System.out.println("db1Num+dbNum2="+dbResult2);
		
		//2. 비교연산자(==, !=, >=, >, <)
		if(intNum1==intNum2) {
			System.out.println("두수가 같습니다.");
		} else {
			System.out.println("두수가 같지 않습니다.");
		}
		if(intNum1!=intNum2) {
			System.out.println("두수가 같습니다.");
		} else {
			System.out.println("두수가 같지 않습니다.");
		}
		
		if(intNum1>=intNum2) {
			System.out.println("두수가 같습니다.");
		} else {
			System.out.println("두수가 같지 않습니다.");
		}
		
		if(intNum1<=intNum2) {
			System.out.println("두수가 같습니다.");
		} else {
			System.out.println("두수가 같지 않습니다.");
		}
		
		
		//3. 논리연산자(!(not), &&(and그리고=둘다 참이나 거짓), ||(or))
	    boolean isRun=false;
		isRun=(intNum1>=10) && (intNum2>20);
		System.out.println(isRun);
		
		
		
		boolean isRun;
		isRun=(intNum1>=10) && (intNum2>20);
		if(isRun==true) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		//조건문
		int score=95;
		//점수가 90점 이상이면 A 출력
		//점수가 80점 이상이면 B 출력
		//점수가 70점 이상이면 C 출력
		//점수가 70점 미만이면 F 출력
		//if~else if~else문 사용
		
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		//100~95점 사이이면 A+
		//94~90점 사이이면 A0
		
		if(score<=100 && score>=95) {
			System.out.println("A+");
		} else if(score<95 && score>=90) {
			System.out.println("A0");
		} else if(score<90 && score>=85) {
			System.out.println("B+");
		} else if(score<85 && score>=80) {
			System.out.println("B0");
		} else if(score<80 && score>=75) {
			System.out.println("C+");
		} else if(score<75 && score>=70) {
			System.out.println("C0");
		} else {
			System.out.println("F");
		}
		
		//반복문
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println("100까지 합=" + sum);
		
		sum=0;
		int i=1;
		while(i<=100) {
			sum=sum+i;
		    i=i+1;
		} System.out.println("100까지의 합=" + sum);
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
				
		while(run) {
			int stop = s.nextInt();
			if(stop==0) {
				run=false;
			}
			System.out.println("-------");
		}
			System.out.println("프로그램 종료");
		
		
			//베열
			int[] num= {1, 2, 3, 4, 5, 6};
			sum=0;
			for(int j=0; j<num.length; j++) {
				System.out.println(num[j]);
				sum=sum+num[j];
		}	System.out.println("합계= " + sum );
			System.out.println("평균= " + (double)sum/num.length);
			
			//int[] number=null; // 넘버 배열을 선언만 하고 생성은 안함/생성은 new int[~] 할때 생성됨
			
			System.out.print("배열크기> "); //배열크기 프린트(안내)
			int count=s.nextInt(); // 배열 크기를 입력받음
			int[] number=new int[count]; // 입력받은 크기만큼 배열을 생성/ 선언하면서 생성해도 됨
			
			sum=0;  //합계 저장변수/ 합계는 0부터 시작해야해서 sum을 초기화 시켜줌
			for(int j=0; j<count; j++) {	//0부터 입력받은 배열의 크기만큼 1씩 증가시키면서 반복
				System.out.println("값[" + j + "]> ");	// 연결해서 j변수에 들어있는 값을 찍음
				number[j]=s.nextInt();		//키보드에서 입력받은 값을 배열j번째에 넣어줌
				sum=sum+number[j];		//j번째 값을 sum에다가 누적시킴
			}
			System.out.println("합계= " + sum);
			
			
			*/
			
			Scanner s=new Scanner(System.in);
			
			boolean run=true;
			int count=0;
			int[] arrary = null;
			int arrarysize;
			int tot=0;
			double avg=0;
			
			while(run) {
				
				System.out.println("---------------------------------------------");
				System.out.println("1. 배열생성 | 2. 데이터 입력 | 3. 데이터 출력 | 4. 종료");
				System.out.println("---------------------------------------------");
				System.out.print("선택> ");
				int menu=s.nextInt();

				
				switch(menu) {
				
				
				case 1:
					System.out.print("배열크기> ");
					
					arrarysize=s.nextInt(); // 배열 크기를 입력받음
					arrary=new int[arrarysize];
					
					
					break;
				case 2:
					for(int i=0; i<arrary.length; i++) {
					System.out.println("숫자 " + i + ">");
					arrary[i]=s.nextInt();
					}
					
					break;
				case 3:
					for(int i=0; i<arrary.length; i++) {
						System.out.println("숫자 " + i + ">" + arrary[i]);
						tot=tot+arrary[i];
						avg=(double)tot/arrary.length;
						
					} System.out.println("총점 " + tot + "\n평균 " + avg);
					break;
				case 4:
					run=false;
					System.out.println("프로그램 종료");
					break;
				default :
					System.out.println("잘못된 판단입니다.");
						
				
				
				}
				
			}
			
	}

}
