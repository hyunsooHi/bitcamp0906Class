package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBufferedFileCopy {

	public static void main(String[] args) throws IOException {

		// 프로그램에서 파일 복사
		// 프로그램이 파일 원본을 읽고 -> 새로운 파일을 생성(쓰기)
		// 원본 파일의 데이터를 읽기위한 스트림 클래스 생성 : InputStream,FileInputStream
		try {
			InputStream in = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			OutputStream out = new FileOutputStream("copy.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		InputStream in = new FileInputStream("eclipse.zip");
		OutputStream out = new FileOutputStream("copy1.zip");
		
		int copyByte = 0;//복사 사이즈 계산

		int bData = -1;//스트림으로부터 읽어온 바이트단위의 데이터

		while(true) {
			bData = in.read();
			if (bData==-1) {
				break;
				
			}
			System.out.println(copyByte);
			copyByte++;
			out.write(bData);
		}
		in.close();
		out.close();
		
		System.out.println("복사된 byte size: " + copyByte);
		
		
		
	}

}
