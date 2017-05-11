package test.gura;

public class Util {
	//static 멤버 필드
	public static int version=1; // 참조 : Util.version
	
	//static 멤버 메소드
	public static void sendMessage(){ //호출: Util.sendMessage()
		System.out.println("메세지를 전송합니다.");
	}
}
