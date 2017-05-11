package test.main;//패키지 식별자

public class MainClass02 {// 이 클래스 안에 정의한것은 멤버라고함. test.main.MainClass01
	
	//static 멤버 메소드 (static이라는 예약어를 붙였기 때문에 static멤버 메소드라고함) 
	public static void main(String[] args) {// main은 식별자 . 이름이 main인 메소드
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//동일한 클래스의 static 멤버메소드를 호출할 때 클래스명 생략가능
		test();// main과 test는 같은 클래스의 멤버이기때문에 클래스명은 생략이 가능함
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
	//static 멤버 메소드
	public static void test(){ //test는 식별자
		System.out.println("test() 메소드가 호출되었습니다.");
		
		System.out.println("test() 메소드가 종료(리턴) 됩니다.");
	}
}
