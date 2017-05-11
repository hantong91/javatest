package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//메소드를 호출하고 나서 리턴되는 데이터를 모두 각각 변수에 담아 보세요.
		long a = test1();
		double b = test2();
		boolean c = test3();
		String d = test4();
		
		//MainClass05. 를적으면 목록이 나오는데 붉은 s가 붙은것은 static을 의미하고 
		//:뒤에 써있는건 리턴되는 데이터타입을 의미함
		
		System.out.println("메인 메소드가 리턴 됩니다.");
		
	}
	
	public static long test1(){
		return 10;
	}
	public static double test2(){
		return 10.1;
	}
	public static boolean test3(){
		return true;
	}
	public static String test4(){
		return "김구라";
	}
}	
