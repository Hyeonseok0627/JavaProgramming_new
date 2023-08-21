package practice;

public class Cafe {
	private String cafeName;
	private int customerCount;
	private int money;
	
	public void take(int money) {
		this.money += money;
		customerCount++;
	}
	
	public Cafe(String name) {
		this.cafeName = name;
	}
	
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public int getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
