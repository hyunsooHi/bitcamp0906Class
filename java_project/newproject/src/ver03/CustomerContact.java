package ver03;

public class CustomerContact extends Contact {

	private String companyName;
	private String product;
	private String job;

	public CustomerContact(String name, String phoneNumber, String email, String address, String birthDay, String group,
			String companyName, String product, String job) {
		super(name, phoneNumber, email, address, birthDay, group);
		this.companyName = companyName;
		this.product = product;
		this.job = job;
	}

	public CustomerContact(String name, String phoneNumber, String email, String address, String birthDay,
			String group) {
		super(name, phoneNumber, email, address, birthDay, group);

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void printContact() {
		super.printContact();
		System.out.println("거래처 회사 이름 : " + companyName);
		System.out.println("거래 품목 : " + product);
		System.out.println("직급 : " + job);
		
	}

	
	
	
}
