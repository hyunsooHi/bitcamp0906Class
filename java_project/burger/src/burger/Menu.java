package burger;

import java.util.Scanner;

public class Menu {
	//상품개수변수
	int bulgogi;
	int sanghai;
	int bulgogi_set;
	int sanghai_set;
	
	int saida;
	int cola;
	int gamja;
	
	//상품가격변수
	int bulgogi_price;
	int sanghai_price;
	int saida_price;
	int cola_price;
	int gamja_price;
	
	public static Scanner sc = new Scanner(System.in); 
	
	public Menu() {
		
	}

	public Menu(int bulgogi,int sanghai,int saida,int cola,int gamja) {
		
	}
	
	public Menu(int bulgogi, int sanghai, int bulgogi_set, int sanghai_set
			) {
		
		this.bulgogi = bulgogi;
		this.sanghai = sanghai;
		this.bulgogi_set = bulgogi_set;
		this.sanghai_set = sanghai_set;
	}

	public void menu_select() {//가격과 개수를 받는 메소드
		
		System.out.println("============");
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.햄버거");
		System.out.println("2.음료수");
		System.out.println("3.사이드");
		System.out.println("4.선택종료");
		
		int select = sc.nextInt();
		
		if (select == 1){
			hamburgerset_choice();
		}
//		else if (select == 2){
//			drink_choice();
//		}
//		else if (select == 3){
//			side_choice();
//		}
		else if (select == 4){
			choice_end();
		}
			
		
	}
	
	public void choice_end() {
		
		new Menu( bulgogi,  sanghai,  bulgogi_set,  sanghai_set);
		System.out.println("============");
		System.out.println("선택한 메뉴");
		System.out.println("불버거" + bulgogi);
	}
	
	
	public void hamburgerset_choice() {
		System.out.println("============");
		System.out.println("세트/단품을 선택하세요");
		System.out.println("1.세트");
		System.out.println("2.단품");
		System.out.println("============");
		
		int select = sc.nextInt();
		
		if (select == 1){
			set_choice();
		}
		else if (select == 2){
			dan_choice();
		}
		
	}
	
	public void set_choice() {
		System.out.println("============");
		System.out.println("세트버거를 선택하세요");
		System.out.println("1.불고기");
		System.out.println("2.상하이");
		int select = sc.nextInt();
		
		if (select == 1){
			System.out.println("============");
			System.out.println("수량을 선택하세요");
			bulgogi_set = sc.nextInt();
			menu_select();
		}
		
		else if (select == 2){
			System.out.println("============");
			System.out.println("수량을 선택하세요");
			sanghai_set = sc.nextInt();
			menu_select();
		}
		
	}
	
	public void dan_choice() {
		System.out.println("============");
		System.out.println("단품버거를 선택하세요");
		System.out.println("1.불고기");
		System.out.println("2.상하이");
		int select = sc.nextInt();
		
		if (select == 1){
			System.out.println("============");
			System.out.println("수량을 선택하세요");
			bulgogi = sc.nextInt();
			menu_select();
		}
		
		else if (select == 2){
			System.out.println("============");
			System.out.println("수량을 선택하세요");
			sanghai = sc.nextInt();
			menu_select();
		}
		
	}
	
	
	
	
	
	
	
	public int total_price() {
		return 0;
		
	}
	
	
}

