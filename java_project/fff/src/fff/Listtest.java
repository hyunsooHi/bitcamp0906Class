package fff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Listtest {

	public static void main(String[] args) {

		//Menupan[] menupan = new Menupan[10];

//		System.out.print(mid + "\t" + mname + "\t" + mprice + "\t" + mnum + "\t" + mtype + "\n");
//		menupan[line_cnt] = new Menupan(mid, mname, mprice, mnum, mtype);

		ArrayList<Menupan> menupanlist = new ArrayList<Menupan>(); // 배열 목록? 객체 배열 (ArrayList) 생성
		menupanlist.add(new Menupan(2009038033, "호랑이", 2009038033, 5,54, "남"));
		menupanlist.add(new Menupan(2009038033, "호랑이", 4324, 5,54, "dj"));

		for (Menupan item : menupanlist) {//for each는 그냥 0부터 끝까지 다 도는것. item이 0 부터 메뉴리스트끝까지 다 돈다
			System.out.println(String.format("이름:%s, 학번:%d, 성별:%s", item.mname, item.mprice, item.mtype));
		}
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		
		System.out.println(menupanlist);
		System.out.println(menupanlist.get(1));
		System.out.println(menupanlist.get(0).mname );
		
		
		
	}
}
