package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new FileWriter("print.txt"));
		
		out.printf("ㅇㅇㅇㅇ %s %d ","ttt",33);
		out.close();
		

	}

}
