package day0607;

public class Throws2 {

	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main메서드에서 예외 처리");
		}
		
		
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1메서드에서 예외 처리");
			throw e; //예외 되던지기
		}
		
	}
}

//예외 처리 후 다시 인위적으로 예외를 발생시키는 것을 '예외 되던지기'라고 함

//예외 되던지기 주의점
//예외 발생한 메서드에서는 try-catch문을 이용하여 예외 처리하고
//메서드 선언부에서는 (인위적으로)발생할 예외를 throws에 지정해야함