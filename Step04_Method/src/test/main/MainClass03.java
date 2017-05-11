package test.main;
//다른 패키지에 있는 특정 클래스 import 하기
import test.plane.AirPlane;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//다른 클래스의 static 멤버 메소드 호출하기
		Person.sing();
		//import 된 클래스의 static 멤버 메소드 호출하기
		AirPlane.fly();//이런게 여러개 이면test.plane.앞에 붙이기 귀찮으니까 import에 넣어버림
		//Air까지치고 ctrl+space치면 자동으로 import가 완성됨
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}



