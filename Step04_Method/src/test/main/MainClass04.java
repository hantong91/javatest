package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//지역변수는 메소드 안에서만 사용할 수 있다.
		// getNum() 메소드가 리턴해주는 int값을
		// int type a라는 변수에 대입 연산자로 담기
		int a=getNum();//MainClass04.가 생략되었음
		
		System.out.println("메인 메소드가 리턴됩니다.");
	}
	//메소드를 호출한 그 위치로 int type 데이터를 return 해 주는 
	//static 멤버 메소드
	public static int getNum(){
		System.out.println("getNum() 호출됨");
		///999 를 멤소드를 호출한 위치로 돌려주기
		return 999;
				/*void는 아무것도 돌려주지않겠다는거고
				 * byte
				 * short
				 * int
				 * long
				 * float
				 * double
				 * char
				 * boolean
				 * String
				 * ... 등등 void 자리에 자바에서 다루는 데이터타입이 들어옴
				 * 함수가 끝나고 해당데이터타입을 돌려줌
				 */
		
	}
}
