package chapter12.circle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import chapter12.circle.Circle;

public class ObjectSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

	
		// 패키지 이름까지 같아야 같은클래스
		// 저장된 파일을 이용해서 인스턴스를 생성 -> 복원
		//복원시에 저장순서 다르면 에러뜸 문자열부터 복원하면 에러뜸
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));

		//String str = (String) in.readObject(); 문자열부터하면 에러
		
		// 복원 : 인스턴스생성하고 반환
		Circle c1 = (Circle) in.readObject();
		Circle c2 = (Circle) in.readObject();

		String str = (String) in.readObject();
		
		in.close();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(str);
		
		
	}

}
