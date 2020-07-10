package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int[] score=null;
		
		
		boolean run=true;
		
		while(run) {
			
			System.out.println("-----------------------------------------------------");
			System.out.println("| 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 |");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");
			
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.print("학생수> ");
				int count=s.nextInt();
				score=new int[count];
				break;
			case 2:
				for(int i=0; i<score.length; i++) {
				System.out.println("점수입력> [" + i + "]> ");
				score[i]=s.nextInt();
				}	
				break;
			case 3: //학생목록 출력
				for(int i=0; i<score.length; i++) {
				System.out.println("점수> [" + i + "]> " + score[i]);
				//score[i]=s.nextInt();	
				}
				break;
			case 4: // 분석출력
				
				int max=0;
				int tot=0;
				double avg=0;
				
				for(int i=0; i<score.length; i++) {
					tot=tot+score[i];
					avg=tot/score.length;
					if(score[i]>max) {
						max=score[i];
					}
				} System.out.println("최고점수 " + max +"\n"+"평균 " + tot/avg);//avg로 해돋 됨 .으로 실수표현은 숫자 뒤에만 가능);
					
				break;
			case 5:
				
				run=false;
				System.out.println("프로그램 종료");
			}
			
		}
	}

}
