package Practice;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("말티즈", "말티즈");
		dogs[1] = new Dog("푸들", "푸들");
		dogs[2] = new Dog("포메라니안", "포메라니안");
		dogs[3] = new Dog("치와와", "치와와");
		dogs[4] = new Dog("진돗개", "진돗개");

		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		//dog 하나씩이라 dog변수를 그대로 사용
		for (Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}