package ex07;

public class Sample {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		//1~100까지의 합계
		while(i<100) {
			i=i+1; // i값을 1씩 증가시킨다(i++ , i+=1)
			sum=sum+i; //i값을 sum에 누적 (sum+=i)
			
		}
		    System.out.println("1~100 까지의 합계" + sum);
		    
		    
		    //0~100까지 짝수 합계
		    i=0;
		    sum=0;
		    
		    while(i<100) {
		    	i=i+2;
		    	sum=sum+i;
		    }
		    System.out.println("1~100까지 짝수의 합계" + sum);
		    
		    //1~99 홀수 합계
		    i=-1;
		    sum=0;
		    
		    while(i<99) {
		    	i=i+2;
		    	sum=sum+i;
		    }
		    System.out.println("1~100까지 홀수의 합계" + sum);
	}

}
