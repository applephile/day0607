package day0607;

public class Finally1 {
	
	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(value1 + " + " + value2 + " = " + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자 변환 불가");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수 값 부족");
			return;
		} finally {
			System.out.println("다시 실행");
		}
		
	}
}
