package day0607;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		//두 개의 정수를 입력받아 곱셉과 나눗셈의 연산 결과 출력
		//입력값에서 정수가 아닌 값이 입력되면 예외가 발생하면서
		//실행이 중단되는데 이를 예외 처리하여 실행되도록 구현
		int num1 = 0, num2 = 0, mul = 0, div = 0;
		Scanner s = new Scanner(System.in);
		
			try {
				System.out.print("첫 번째 수 : ");
				num1 = s.nextInt();
				System.out.print("두 번째 수 : ");
				num2 = s.nextInt();
				
				mul = num1 * num2;
				div = num1 / num2;
				
				System.out.printf("%d X %d = %d\n", num1, num2, mul);
				System.out.printf("%d / %d = %d\n", num1, num2, div);
			} catch(InputMismatchException e) {
				System.out.println("예외 발생");
			} catch(ArithmeticException e) {
				System.out.println("예외 발생");
			} catch(Exception e) {
				System.out.println("확인하세요");
			} finally {
				s.close();
			}
		
	}

}
