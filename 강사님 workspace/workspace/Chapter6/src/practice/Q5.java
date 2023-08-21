package practice;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer kim = new Customer("김씨", 5000);
		Customer kong = new Customer("콩씨", 10000);
		Cafe starDabang = new Cafe("별다방");
		Cafe kongDabang = new Cafe("콩다방");
		
		kim.take(starDabang,"아메리카노", 4000);
		kong.take(kongDabang,"카페라떼", 4500);
		
		System.out.println(kim.getCustomerName()+"의 결제메뉴 : " + kim.getLastOrder());
		System.out.println(kim.getCustomerName()+"의 잔돈 : " + kim.getMoney() + "원");
		System.out.println(kong.getCustomerName()+"의 결제메뉴 : " + kong.getLastOrder());
		System.out.println(kong.getCustomerName()+"의 잔돈 : " + kong.getMoney() + "원");
		System.out.println(starDabang.getCafeName()+" 수익: " + starDabang.getMoney());
		System.out.println(starDabang.getCafeName()+" 손님수: " + starDabang.getCustomerCount());
		System.out.println(kongDabang.getCafeName()+" 수익: " + kongDabang.getMoney());
		System.out.println(kongDabang.getCafeName()+" 손님수: " + kongDabang.getCustomerCount());
	}

}
