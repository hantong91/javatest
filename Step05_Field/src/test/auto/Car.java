package test.auto;

public class Car {
	//일반 멤버필드 정의하기
	public String brand="Audi"; //클래스 안에서 정의하는건 변수가아니라 필드
	//public은 접근성을 보여줌 다른 패키지에서도 사용할수있게 함
	
	
	//일반멤버 메소드 정의하기
	public void drive(){  //메소드안에서 정의해야 지역변수
		System.out.println("달려요!");
	}
}
