package day0607;

import java.util.Scanner;

//1~100사이의 랜덤 수 하나 지정
//사용자가 그 수 맞추는 게임
//랜덤 수보다 큰 수 입력 시 '작은 수를 입력하세요' 출력
//랜덤 수보다 작은 수 입력 시 '큰 수를 입력하세요' 출력
//맞추면 시도횟수 및 '정답입니다' 출력

//1부터 100 사이의 값을 입력하지 않은 경우 예외 발생
//문자를 입력 시에도 예외 발생

public class Exam1 {

	public static void main(String[] args) {

		
		int rndNum = (int)(Math.random() * 100 + 1);
		int user;
		int count = 1;
		
		
		while(true) {
			System.out.print("1과 100사이의 값 입력 : ");
			try {
				Scanner scan = new 	Scanner(System.in);
				user = scan.nextInt();
				
				if(user < 1 || user > 100) {
					throw new Exception();
				} else if(rndNum < user) {
					System.out.println("더 작은 수 입력");
					count++;
				} else if(rndNum > user) {
					System.out.println("더 큰 수 입력");
					count++;
				} else if(rndNum == user) {
					System.out.println("정답");
					System.out.println("시도횟수 : " + count);
					break;
				}
				
			} catch (Exception e) {
				System.out.println("유효하지 않습니다. 다시 입력하세요");
				continue;
			}
		}
		
//		int answer = (int)(Math.random() * 100 + 1);
//		int input = 0;
//		int count = 0;
//		
//		do {
//			System.out.print("1~100 사이의 숫자 입력 : ");
//			count++;
//			
//			try {
//				Scanner scan = new 	Scanner(System.in);
//				int num = scan.nextInt();
//				input = num;
//				input = new	Scanner(System.in).nextInt();
//				
//				if(input < 0 || input > 100) throw new Exception();
//				
//			} catch (Exception e) {
//				System.out.println("값 다시 확인");
//				continue;
//			}
//			 
//			if(answer > input) {
//				System.out.println("더 큰 수 입력");
//			} else if(answer < input) {
//				System.out.println("더 작은 수 입력");
//			} else {
//				System.out.println("정답");
//				System.out.println("시도횟수 : " + count);
//				break;
//			}
//		} while(true);
	}

}






