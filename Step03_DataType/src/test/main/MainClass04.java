package test.main;
/*
 * 	[ java 데이터 type]
 * 
 * 	4. 논리형
 * 
 * 	-boolean
 * 	-참, 거짓을 나타내는 데이터 type
 * 	-종류 : true, false
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		boolean isWait=true;
		boolean isRun=false;
		boolean isGreater=10>5;
		boolean result=!true;
		boolean result2=true||false;
		boolean result3=true&&false;
		
		System.out.println("메인 메소드가 종료 됩니다.");
		
		//string : reference data type(참조 데이터 타입) 이 이외에 무한대의 데이터타입이 있다 (만들수있기때문)
		// byte short int long float double char boolean : 8primitive data type(기본데이타타입)
		// string은 아이디가 담기지만 , 기본데이타타입은 실제 값이 담겨있음
		
		
		/*int num=10; String name="kimgura"; String a= name;
		static	 |			stack 			|heap(여기에 생성되는것들을 객체라고함)
		 객체는 속성과 기능으로 이루어져있다.(Field(저장소)+Method(기능))
		field: 뭔가의 저장소, method: 기능
		class로 객체를 설계할수있다.(어느저장소에 어느기능을가진지)
		
		int				num에 10이 들어감
		String			name에 키값(참조값)이 들어감		키("kimgura")	
		String			a에 키값이 들어감			키(name("kimgura")) */
	}	 
}		
