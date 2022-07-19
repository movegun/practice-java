/*class Account {
	String ssn = "123456-1234567";
	long balance = 10000L;
}*/
class Account {
	private String ssn = "123456-1234567";
	private long balance = 10000L;
	Account(String ssn){
		this.ssn = ssn;
	}
	//getter 메소드 
	String getSsn(){
		return ssn;
	}
	long getBalance(){
		return balance;
	}
	//setter 메소드
	/*void setSsn(String ssn){
		this.ssn = ssn;
	}*/
	void setBalance(long balance){
		this.balance = balance;
	}
}

class C {
	void use(){
		Account a = new Account("123456-1234567");

		System.out.println("ssn(1): " + a.getSsn());
		System.out.println("balance(1): " + a.getBalance());
		//a.setSsn("654321-1234567");
		a.setBalance(5000L);
		System.out.println("ssn(2): " + a.getSsn());
		System.out.println("balance(2): " + a.getBalance());
	}
	public static void main(String[] args) {
		new C().use();
	}
}
