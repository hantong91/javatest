package test.main;
/*
 * 	[ java 데이터 type]
 *  2. 숫자형
 *  
 *  
 *  - 정수형 : byte, short, int, long
 *  - 실수형 : float, double
 */
public class MainClass02 {
	public static void main(String[] args) {// main을 적고 ctrl+space하면 고른후 엔터
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		//정수형 변수 선언과 동시에 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		
		//실수형 변수 선언과 동시에 값 대입하기
		float num1=10.1f;
		double num2=10.1d;
		double num3=10.2;// d 생략 가능
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
