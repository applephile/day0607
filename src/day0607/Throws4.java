package day0607;

import java.util.Scanner;

public class Throws4 {

	public static void main(String[] args) {
		
		int cnt = 0;
		int[] arr = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열 크기를 입력하세요 > ");
		cnt = sc.nextInt();
		
		if(cnt < 5) {
			try {
				throw new MyException(5);
			} catch(MyException e) {
				e.printStackTrace();
			} finally {
				sc.close();
			}
		} else {
			arr = new int[cnt];
			System.out.println("크기가 " + cnt + "인 배열이 만들어졌어요.");
		}
	}

}

class MyException extends Exception{
	
	private int cnt;
	
	public MyException(int cnt) {
		super("크기는 " + cnt + "이상이어야 합니다.");
	}
	
}