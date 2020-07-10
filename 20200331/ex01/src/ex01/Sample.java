package ex01;


public class Sample {

		public static void main(String[] args) { //3가지 기본성 : 메소드 필드 클래스
		//student(); //car 메소드만 출력을 원해 주석처리를함
		car();
	}	
	
		public static void student() {
			Student s1=new Student(); //기본 생성자 class에 생성자를 주지 않아도 기본으로 생성자로 된다
			//클래스   객체
			s1.sno="01"; //필드(속성)
			s1.sname="홍길동";
			s1.tel="010-5043-7887";
			s1.print(s1);
			
			Student s2=new Student();
			
			s2.sno="02";
			s2.sname="심청이";
			s2.tel="010-1234-5678";
			s2.print(s2);
			
			Student s3=new Student();
			
			s3.sno="03";
			s3.sname="김나다";
			s3.tel="010-5469-7512";
			s3.print(s3);
			
			Student s4=new Student("04","강감찬", "010-5355-7526");
			s4.print(s4);
		}
		public static void car() {
			Car car1=new Car();//생성자
			
			car1.color="검정";
			car1.model="그랜저";
			car1.maxSpeed=250;
			car1.printCar(car1);
			
			Car car2=new Car();
			
			car2.color="회색";
			car2.model="소나타";
			car2.maxSpeed=190;
			car2.printCar(car2);
			
			Car car3=new Car("뉴소나타", "은색", 180);
			car3.printCar(car3); //메소드?
		}
}
