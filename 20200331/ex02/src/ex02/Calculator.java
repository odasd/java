package ex02;

//계산기 클래스
public class Calculator {
	//필드
	int x;
	int y;
	
	
	//생성자-일반 생성자도 사용할거면 기본과 일반 다 정의해야함 생성자의 이름은 클래스 이름과 동일하게 하면됨
	//기본생성자(객체를 생성하는 생성자)
	Calculator() {
		
	}
	
	//일반 생성자
	Calculator(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//더하기 메서드(동작)
	int plus(int x,int y) {
		int result= x + y;
		return result;
	}
	
	
	
	
	//나누기 메서드
	double divide(int x, int y) {
		double result=(double)x / y;
		return result;
	}
	
	//곱하기 메서드
		int multiply(int x, int y) {
			int result=x * y;
			return result;
		}
		
		//메서드는 반드시 return을 해줘야함  출력만 사용하는 메소드는 리턴이 없음 리턴이 없을시 앞에 void를 적어야함
	//빼기 메서드 
		int minus(int x, int y) {
			int result=x - y;
			return result;
		}
		
		public static void powerOn() { //return 타입이 없을 경우에는 메소드 앞에 void사용
			System.out.println("전원을 켭니다.");
		}
}
