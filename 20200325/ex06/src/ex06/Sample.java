package ex06;

public class Sample {

	public static void main(String[] args) {
		String[] name = {"냉장고", "세탁기", "에어컨"};
		int[] amount = {2, 3, 5};
		int[] price = {300, 100, 150};
		int[] sum = new int[3];
		int total=0; 
		String[] remark = new String[3];
		
		System.out.println("----------------매출 보고서------------------");
		System.out.println("상품명\t수량\t단가\t금액\t비고");
		
		for(int i=0; i<=2; i++) {
		sum[i] = amount[i] * price[i];
		total=total+sum[i]; // 매출합계 값
			if(sum[i]>=700) {
				remark[i] = "최우수";
			} else if(sum[i]>=500) {
				remark[i] = "우수";
			} else  {
				remark[i] = "보통";
			}
			System.out.println(name[i]+"\t"+amount[i]+"\t"+price[i]+"\t"+sum[i]+"\t"+remark[i]);
			}
		    System.out.println("--------------------------------------");
		    System.out.println("매출합계"+"\t"+"\t"+"\t"+total);
		    System.out.println("--------------------------------------");
		
		}
	}


//화나게 한거다 마스터해라