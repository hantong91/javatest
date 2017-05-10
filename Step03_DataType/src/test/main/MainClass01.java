package test.main;
/*
 * [ java 데이터 type ]  javascript와는 다르게 변수타입을 정했으면 해당타입변수만 들어갈수 있다.
 * 						즉, javascript에서는 var로 여러타입변수가 들어갔지만 
 * 						java는 string선언했으면 문자만 가능
 * 1. String type
 * 
 * 	- 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass01 {
	//실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args){
		/*
		 * 디버깅하려면 줄번호앞에 더블클릭으로 선택하고 벌레아이콘 클릭하여 debug as>java application 클릭
		 * 디버그모드로 진입되면 f6으로 디버그 지역을 넘길수있음
		 */
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		// 김구라 라는 문자 데이터를 java 에서 다룰려면?
		String name = "김구라";
		
		//name 변수 안에 있는 문자열 정보를 콘소창에 출력하기
		System.out.println(name);
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
