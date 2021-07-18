package Bank;

public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}
	}
	public int getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(int cashAmount) {
		if(cashAmount >= 0) {
			this.cashAmount = cashAmount;
		}
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	
}
