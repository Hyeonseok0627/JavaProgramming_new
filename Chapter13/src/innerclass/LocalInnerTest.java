package innerclass;


class Outter{
	
	int outNum = 100;
	static int sNum = 200;
	
	//�ż���	
	Runnable getRunnable(int i){

		int num = 100; //��������
		
		//��������Ŭ����
		class MyRunnable implements Runnable{

			int localNum = 10;
				
			@Override
			public void run() {
				//num = 200;   //���� ��. ���������� ����� �ٲ�Ƿ� ���� ����Ұ��ϴ� ���Ұ�
				//i = 100;     //���� ��. �Ű����� ���� ��������ó�� ����� �ٲ�Ƿ� ���� ����Ұ��ϴ� ���Ұ�
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outter.sNum + "(�ܺ� Ŭ���� ���� ����)");
				}
			}
		 return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}