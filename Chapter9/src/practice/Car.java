package practice;

public class Car {

	protected String name;
	
	protected Car() {}
	
	protected Car(String name) {
		this.name = name;
	}
	
	protected void start() {
		System.out.println(name + "시동을 켭니다.");
	}
	protected void drive() {
		System.out.println(name + "달립니다.");
	}
	protected void stop() {
		System.out.println(name + "멈춥니다.");
	}
	protected void turnoff() {
		System.out.println(name + "시동을 끕니다.");
	}
	protected void washCar() {
		System.out.println("세차를 합니다.");
	}
	
	final protected void run( ) {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}
