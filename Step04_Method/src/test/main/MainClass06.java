package test.main;

import test.factory.MyFactory;
public class MainClass06 {
	public static void main(String[] args) {
		//MyFactory 클래스에 정의된 static 멤버 메소드를 모두 호출해보세요
		//리턴해주는 데이터가 있다면 변수에 담아 보세요.
		MyFactory.printMsg();//void타입이기땜에 담을수 없음
		int a= MyFactory.getCount();
		String b=MyFactory.getMsg();
		String c=b; //String은 참조값(id)을 가지기때문에 키값을 복사함
		//참조값(id) 복사
		int d=a; //실제 값을 복사함
		//value 값 복사
	}
}
