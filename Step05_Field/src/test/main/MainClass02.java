package test.main;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car type 객체 2개 생성해서 참조값을 각각 지역변수에 담기
		Car c1 =new Car();
		Car c2=new Car();//new를 두번 선언했으므로 다른 키값을 가진객체가 생성
		//c2 에 담겨있는 참조값을 이용해서 필드의 내용 수정하기
		c2.brand="쌍용";//정의전에는 Audi가 들어있었으나 brand의 값을 다시 정의 했음 
		
		// c1, c2 객체의 필드를 참조해서 값을 복사해주기
		String a=c1.brand;
		String b=c2.brand;
	}
}
