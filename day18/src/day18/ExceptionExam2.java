package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExam2 {
	public static void main(String[] args) {
		
		try {
			readFile();
			System.out.println("파일처리성공");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("파일처리실패");
		}
	}

	private static void readFile() throws IOException{
		FileReader fr = null;
		try {
			fr = new FileReader("poem.txt");
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			System.out.println();
			System.out.println("파일읽기 종료");
		} finally {
			if (fr != null) fr.close();
		}
	}
}
