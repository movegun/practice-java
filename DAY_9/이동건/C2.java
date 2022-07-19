class Account{
	private String ssn ="123456-7891234";
	private long balance = 10000L;
	Account(String ssn){
		this.ssn = ssn;
	}
	//getter method        결국에는 내가만든 메소드아님?
	String getSsn(){
		return ssn;
	}
	long setBalance(){
		return balance;
	}
	//setter 메소드
	void setSsn(String ssn){
		this.ssn = ssn;
	}
	void setBalance(Long balance){
		this.balance = balance;
	}
}

class C{
	void use(){
		Account a = new Account("123456-7894561");

		System.out.println("ssn1:"+a.getSsn());
		System.out.println("밸런스1:"+a.getBalance);
		a.setSsn("123456-1234561");
		a.setBalance(5000L);
		System.out.println("ssn2:"+a.getSsn());
		System.out.println("밸런스2:"+a.getBalance());
	}
	public static void main(String[] args){
		C c= new C();
		c.use();
	}
}


















{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
