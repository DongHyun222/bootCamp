package day_17;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExam {
	public static void main(String[] args) {
//		try {
//			readFile2();
//			System.out.println("파일처리성공");
//		} catch (FileNotFoundException e) {
//			System.err.println("파처실");
//		}
		readFile();
	}
	
	private static void readFile() {
		//파일에서 문자를 읽기
		
		try {	//파일이 src안에 있는게 아니라 자바 프로젝트 파일안에 있어야 됨
			FileReader fr = new FileReader("poem.txt");
			System.out.println("파일이쓰");
		} catch (FileNotFoundException e) {
			System.out.println("파일없어욧");
			System.err.println("노파일");
			e.printStackTrace();
		}
	}
	
	private static void readFile2() throws FileNotFoundException {
		//파일에서 문자를 읽기
		FileReader fr = new FileReader("poem.txt");
		System.out.println("파일이쓰");
	}
}
