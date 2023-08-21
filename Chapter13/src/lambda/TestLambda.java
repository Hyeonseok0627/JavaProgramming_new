package lambda;

//���ٽ��� ����ϱ����� �������̽�
interface PrintString{
	
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString lambdaStr = s->System.out.println(s);  //���ٽ��� �ش� �ż���(s->System.out.println(s);)�� ����(String str)�� ����
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);                          //�������̽��� lambdaStr�� �޼��� �Ű������� ����
		
		PrintString reStr = returnString();  
		reStr.showString("hello ");
		
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {         //��ȯ ������ ���
		return s->System.out.println(s + "world");
	}
}