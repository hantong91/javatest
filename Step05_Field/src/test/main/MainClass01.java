package test.main;

import test.auto.Car;
public class MainClass01 {
	
	public static void main(String[] args) {
		//Car type 객체를 생성하고
		//참조값을 Car type c1 이라는 변수에 저장하기
	Car	c1 = new Car();
	//c1 에 들어있는 참조값을 이용해서 메소드 호출하기
	c1.drive();
	// c1에 들어있는 참조값을 이용해서 필드 참조하기, 필드는 호출이아니고 참조하는것
	String a = c1.brand;
	}
	
	
	/*
	 *  static             |        stack        |        heap
	 *  
	 *  Car (Car 타입)				 c1[19]					19 (Car 클래스로만든 객체 참조값은 Car타입으로 받아야함)
	 *  												[
	 *  												brand [20]
	 *  												ㅡㅡㅡㅡㅡㅡㅡ
	 *  												drive(){}
	 *  												]
	 *  
	 *  												20[
	 *  												ㅡㅡㅡㅡ
	 *  												"Audi"]	
	 */										
}
