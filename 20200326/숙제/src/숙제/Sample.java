package 숙제;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		boolean run=true;
		
		int[] num=new int[100];
		String[] name=new String[100];
		int[] kor=new int[100];
		int[] eng=new int[100];
		int[] mat=new int[100];
		
		int count=0;
		
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println(" 1. 성적입력 | 2. 성적목록 | 3. 성적조회 | 4. 종료 ");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.println("------------------------------------------");
				System.out.println("성적입력");
				System.out.println("------------------------------------------");
				System.out.print("번호> ");
				num[count]=s.nextInt();
				System.out.print("성명> ");
				name[count]=s.next();
				System.out.print("국어> ");
				kor[count]=s.nextInt();
				System.out.print("영어> ");
				eng[count]=s.nextInt();
				System.out.print("수학> ");
				mat[count]=s.nextInt();
				System.out.println("결과: 성적입력완료");
				break;
			case 2:
				System.out.println("------------------------------------------");
				System.out.println("성적목록");
				System.out.println("------------------------------------------");
				for(int i=0; i<count; i++ ) {
					System.out.println(num[i] +"\t"+ name[i]+ "\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]);
					System.out.println();
				}
				break;
			case 3:
				
				break;
			case 4:
				run=false;
				System.out.println("프로그램종료");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}
				
				
				
		

	}

}
