package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt", true));// append true 하니까 로그로 쓰면되겠네 계속
																					// 이어서쓰네

		out.write("안녕하세요!!!!");
		out.newLine();
		out.write("반갑습니다");
		out.newLine();
		out.write("날짜 = 2021-10-26");
		out.newLine();

		out.newLine();
		out.close();

	}

}
