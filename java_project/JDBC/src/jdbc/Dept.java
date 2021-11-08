package jdbc;

public class Dept {

	private int deptno;
	private String dname;
	private String loc;

	// 생성자 초기화
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// 기본 생성자: Beans 클래스 생성시 반드시 기본 생성자가 있어야한다!!!
	// 빈즈는 시스템에서 자동으로 만들어주는 클래스이다
	public Dept() {
	}

	// vo : 읽기전용 value object , getter 메소드만 존재 데이터베이스에서 읽기만하고 출력만 할때
	// dto : 읽고쓰기가능 data trans object , getter/setter 존재

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return deptno +"\t"+ dname + "\t" + loc ;
	}

	
	
}
