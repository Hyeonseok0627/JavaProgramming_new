package lambda;

public class TestMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x,y) -> (x>=y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}

}
