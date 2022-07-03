package day0607;

public class TryCatch1 {
	
	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("데이터 공백");
		}
		
	}
	
}
