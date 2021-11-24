package chapter12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {

	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("test.txt");

		int readCnt = 0;
		char[] cbuf = new char[100];

		readCnt = in.read(cbuf, 0, cbuf.length);

		for (int i = 0; i < readCnt; i++) {
			System.out.print(cbuf[i]);
			
		}
		
		in.close();
		
	}

}
