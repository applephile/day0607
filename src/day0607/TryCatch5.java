package day0607;

public class TryCatch5 {

	public static void main(String[] args) {
		
		//정수형 3칸짜리 arr배열 생성
		//순서대로 1, 2, 3 값 입력
		//출력은 0~4번 인덱스까지 for문 사용
		//예외 발생 시 '인덱스 범위 벗어남' 출력
		//예외처리 할 것
		int i;
		int[] arr = new int[3];
		String str = null;
		
		try {
			for(i=0; i<arr.length; i++) {
				arr[i] = i + 1;
			}
			
			for(i=0; i<4; i++) {
				System.out.println(arr[i]);
			}
			
			i = 4 / 0;
			
			str.charAt(i);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외");
			System.out.println(e);
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외");
		} catch (Exception e) {
			System.out.println("Exception 예외");
		} 
		finally {
			System.out.println("예외 발생 무관 무조건 실행");
		}
	}

}
