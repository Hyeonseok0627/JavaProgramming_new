package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price =10000;
		Customer lee = new Customer(10010, "이순신");
		System.out.println(lee.getCustomerName()+ " 님이 지불해야 하는 금액은 "
				+ lee.calcPrice(price)+ " 원 입니다.");
		
		VIPCustomer kim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(kim.getCustomerName()+ " 님이 지불해야 하는 금액은 "
				+ kim.calcPrice(price)+ " 원 입니다.");
		
		//vc : 가상클래스, 오버라이딩된 매서드만 new한 하위클래스것만 따르고, 다른 자료형은 모두 상위클래스것을 따름
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " 
		+ vc.calcPrice(10000) + " 원 입니다.");
	}
}
