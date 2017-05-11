package test.main;

import test.star.Marine;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//Marine type 객체를 생성해서
		//참조값(id)를 이용해서 move()메소드 호출하기
		new Marine().move();//Marine type 객체 1회용으로 사용하기
		//이런식으로 코딩하면 호출하고 버리는 일회용
		
		//Marine type 객체 생성해서 참조값(id) 를 변수에 담고 여러번 참조해서 사용하기
		Marine m1=new Marine();//클래스명이 객체의 타입이된다. 변수에담으면 여러번사용가능
		//정확히는 test.star.Marine타입
		m1.move();
		m1.move();
		m1.move();
		System.out.println("메인 메소드가 리턴 됩니다.");
		
		
		/*
		 * static은 클래스가 올라감 클래스 하나당 하나씩만 올라감 /클래스명으로 참조
static이 붙은 멤버는 그 멤버가 속한 class통째로 static영역에 올라감 >> 그래서 클래스명.메소드명()으로 호출
stack은 변수가 만들어지는 영역/ 변수명으로 참조
heap 객체가 생성되는 영역/ 참조값(id)로 참조


new 클래스명(); 으로 객체를 생성하면 heap에 올라가고 
클래스명 변수1 = new 클래스명(); 처럼 변수에 담으면
stack영역에 변수가 올라감
		 */
	}
}
