package day0607;

public class Throw {

	public static void main(String[] args) {
		
		try {
			System.out.println("출력");
			Exception e = new Exception("고의 예외 발생");
			throw e;
			//throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("에러 발생 : " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
