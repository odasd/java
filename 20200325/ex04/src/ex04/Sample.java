package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int[] num=new int[5];
		//배열(참조타입) 몇번째에 대해 인덱스라고 표현함 //배열의 시작은 0부터 시작함
		/*
		int[] d= {80, 90, 100, 88, 68};
		int sum=0;
		
		for(int i=0; i<=d.length-1; i++) {
			System.out.println(i+"번째 : " +d[i]);
			sum=sum+d[i];
			
		}
		System.out.println("합계 : " + sum);
		double avg=sum/d.length;
		System.out.println("평균 : " + avg);
		*/
		
		
		
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		while(run) {
		
		
			int sum=0;
			
			
		
			for(int i=0; i<num.length; i++){
				System.out.println(i+"번째값?");
				num[i]=s.nextInt();
			}
			
		
		
			for(int i=0; i<num.length; i++) {
				sum=sum+num[i];
			}
			
			
			System.out.println("합계 : " + sum);
			double avg=sum/num.length;
			System.out.println("평균값 : " + avg);
			run=false;
		}
		
		
	} 

}
