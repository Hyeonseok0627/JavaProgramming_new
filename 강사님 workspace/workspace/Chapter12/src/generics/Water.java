package generics;

public class Water extends Material{

	public void doPrinting() {
		System.out.println("Water 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 Water 입니다.";
	}
}
