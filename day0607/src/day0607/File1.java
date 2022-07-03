package day0607;

import java.io.File;
import java.util.Scanner;

public class File1 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("파일명 : ");
			File f = createFile(s.nextLine());
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해주세요.");
		}
		
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals("")) 
			throw new Exception("파일 이름 유효하지 않습니다.");
		
		File f = new File(fileName); //File 클래스의 객체 생성
		
		//File객체의 createNewFile()메서드를 이용하여 파일 생성
		f.createNewFile();
		
		//생성된 객체의 참조 반환
		return f;
	}
}
