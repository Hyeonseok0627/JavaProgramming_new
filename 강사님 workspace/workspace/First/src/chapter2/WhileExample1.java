package chapter2;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
		int num1 = 11;
		int sum1 = 0;
		
		do {
			sum1 += num1;
			num1++;
		}
		while(num1 <= 10);
		System.out.println("1부터 10까지의 합은 "+sum1+"입니다.");
	}

}
