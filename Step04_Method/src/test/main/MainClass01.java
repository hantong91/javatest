package test.main;//패키지 식별자

public class MainClass01 {// 이 클래스 안에 정의한것은 멤버라고함. test.main.MainClass01
	
	//static 멤버 메소드 (static이라는 예약어를 붙였기 때문에 static멤버 메소드라고함) 
	//메소드는 javascript의 함수라고보면 되는거같음
	public static void main(String[] args) {// main은 식별자 . 이름이 main인 메소드
		System.out.println("메인 메소드가 시작되었습니다.");
		
		// static 멤버 메소드 호출하기  >>  class명.static 멤버 메소드명();
		MainClass01.test();// 여기서 MainClass01 은 publick class의 MainClass01이다
							//javascript와는 다르게 함수가 끝나고 리턴되어도 아무값도 안 올수가있다. 
							//void는 아무런 값도 return할때 돌려주지않겠다는 뜻
		System.out.println("메인 메소드가 종료됩니다.");
	}
	//static 멤버 메소드
	public static void test(){ //test는 식별자
		System.out.println("test() 메소드가 호출되었습니다.");
		
		System.out.println("test() 메소드가 종료(리턴) 됩니다.");
	}
}
