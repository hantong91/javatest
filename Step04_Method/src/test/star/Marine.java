package test.star;

public class Marine {
	//일반 멤버 메소드 (static이안붙었음)
	public void move(){
		System.out.println("마린이 움직여요!");
		
		//클래스는 설계도이다.
		// heap 영역에 생성되는것은 객체이고 그 객체를 만들려면 new 클래스명()  하면 됨
		// new 클래스명() 위치는 키값이 옴
		//static메소드는 클래스명.메소드() 로 호출했지만
		//없으면 키값.메소드()로 호출함 >> new Marine().move()
		//new Marine()에는 참조값이 담겨있음.
		//new할때마다 새로운 객체가 생성된다.
	}
}
