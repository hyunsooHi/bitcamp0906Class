package fff;

public class Menupan {
	
	public int mid;
	public String mname;
	public int mprice;
	public int mnum;
	public int total_price;
	public String mtype;
	
	
	


	public Menupan(int mid, String mname, int mprice, int mnum, int total_price, String mtype) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
		this.mnum = mnum;
		this.total_price = total_price;
		this.mtype = mtype;
	}



	public Menupan() {}



	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public int getTotal_price() {
		return total_price;
	}


	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public int getMprice() {
		return mprice;
	}


	public void setMprice(int mprice) {
		this.mprice = mprice;
	}


	public int getMnum() {
		return mnum;
	}


	public void setMnum(int mnum) {
		this.mnum = mnum;
	}


	public String getMtype() {
		return mtype;
	}


	public void setMtype(String mtype) {
		this.mtype = mtype;
	}



	@Override
	public String toString() {
		return "Menupan [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + ", mnum=" + mnum + ", total_price="
				+ total_price + ", mtype=" + mtype + "]";
	}




	

	
	
	
}
