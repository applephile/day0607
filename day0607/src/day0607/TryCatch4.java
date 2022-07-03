package day0607;

import java.io.IOException;

public class TryCatch4 {

	public static void main(String[] args) {
		
		int ch = 0;
		
		try {
			while((ch = System.in.read()) != '\n') { 
				System.out.println((char)ch);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
	}

}
