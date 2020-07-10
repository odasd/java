package ex02;

public class Car {
	//필드(속성) 직접필드값을 수정하지 못하게 프라이빗으로 줌
	private String company;
	private int maxSpeed;
	
	
	//set()메서드 			//매개변수
	public void setCompany(String company) {
		this.company=company;
		
		
	}
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed<0) {
			this.maxSpeed=0;
		} else {
			this.maxSpeed=maxSpeed;
		}
		
	}
	
	//get()메서드
	public String getCompany() {
		return company;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	//생성자(기본생성자) 찍어내는 틀이라함
	Car() {
		
	}
	
	//메서드(동작) 무슨 동작을할지 정의함
	public void printCar() {
		System.out.println("제조 회사 : " + company);
		System.out.println("최대 속도 : " + maxSpeed);
	}
}
