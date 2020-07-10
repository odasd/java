package pt01;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		sung();
		
	}
	
	
	public static void sung() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String[] num= new String[100], name= new String[100];
		int[] kor= new int[100], eng=new int[100], mat=new int[100];
		int count=0;
		
		while(run) {
			System.out.println("---------------*menu*----------------");
			System.out.println("1.성적입력 | 2.성적목록 | 3.성적조회 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("[menu] > ");
			int menu=s.nextInt();
			switch(menu) {
			case 1:
				System.out.println("---------------*성적입력*--------------");
				System.out.print("[번호] >");
				num[count]=s.next();
				System.out.print("[성명] > ");
				name[count]=s.next();
				System.out.print("[국어] > ");
				kor[count]=s.nextInt();
				System.out.print("[영어] > ");
				eng[count]=s.nextInt();
				System.out.println("[수학] > ");
				mat[count]=s.nextInt();

				
				System.out.println("! "+name[count]+ "의 성적 정보 등록이 완료되었습니다.");
				break;
			case 2:
				System.out.println("---------------*성적목록*--------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t평균");
				System.out.println("-------------------------------------");
				int[] sum= new int[100];
				double[] avg= new double[100];
				for(int i= 0; i<=count-1; i++) {
					sum[i]= kor[i]+ eng[i]+mat[i];
					avg[i]= (double)sum[i]/3;
					System.out.println(num[i]+"\t"+ name[i]+"\t"+ kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+avg[i]);
				}
				break;
			case 3:
				System.out.print("[번호] ");
				int no=s.nextInt();
				for(int i= 0; i<=count-1; i++) {
					if (num[i].equals(no)) {
						System.out.print("[성명] "+ name[i]+"\n[국어] "+kor[i]+ "\n[영어] "+eng[i]+ "\n수학"+ mat[i]);
					}
				}
				break;
			case 4:
				run= false;
				System.out.println("프로그램을 종료합니다. 수고하셨습니다.");
				break;
			default:
				System.out.println("잘못된 명령입니다. 다시입력해주세요.");
				
			}
		}
	}

}
