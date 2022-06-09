package day0607;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		//1부터 10까지의 숫자가 입력되어 있는 배열이 있다
		//배열의 값을 출력할 때
		//배열의 범위가 벗어나는 경우 오류 발생
		//오류의 표시 없이 '인덱스 초과'로 표시되도록 설정
//		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		try {
//			int num = s.nextInt();
//			System.out.println(arr[num]);
			for(int i : arr) {
				System.out.print(arr[i-1] + ", ");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 초과");
		} catch(Exception e) {
			System.out.println("확인하세요");
		}
//		finally {
//			s.close();
//		}
		
	}

}
