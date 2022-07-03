package day0607;

public class TryCatch3 {

	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "0";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n", value1, value2, result);
			
			int result2 = value1 / value2;
			System.out.printf("%d / %d = %d\n", value1, value2, result2);
			
			//멀티 catch문 주의점 
			//부모-자식 관계 불가능
			//catch문에서 메서드 호출 시 하나의 예외에서만 가지고 있는 메서드 호출하면 안됨
		} catch(NumberFormatException | ArithmeticException e) {
			System.out.println("문자 -> 숫자 변환 불가");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
