package three;

public class three {

	/*
		1. 객체지향 프로그래밍에 대한 개념을 이해합니다.
		2. 클래스를 설계하는 방법에 대해 학습합니다.
		3. 객체의 구성요소(필드, 메서드, 생성자)에 대해서 학습합니다.
		4. 클래스 변수, 인스턴스 변수의 차이점에 대해서 학습합니다.
		5. 생성자와 생성자 오버로딩에 대해 학습합니다.
		6. this와 this() 키워드에 대해 학습합니다.
		7. 접근 제어자에 대해 학습합니다.
		8. package와 import에 대해 학습합니다.
		9. 상속, 오버라이딩 을 통해 기능을 확장하는 방법을 배웁니다.
		10. super와 super() 키워드에 대해 학습합니다.
		11. 다형성의 원리와 구현 방법에 대해 학습합니다.
		12. 추상 클래스에 대해 학습합니다.
		13. 인터페이스의 역할에 대해 이해하고 구성 요소와 구현 방법에 대해 학습합니다.
		14. 인터페이스의 디폴트 메서드와 static 메서드에 대해 학습합니다.
		15. 인터페이스의 다형성 원리와 구현 방법에 대해 학습합니다.
	*/
	public static void main(String[] args) {
		
		Car[] carArray = new Car[3];
		
		Car car1 = new Car();
		car1.changeGear('P');
		carArray[0] = car1;
		
		Car car2 = new Car();
		car2.changeGear('N');
		carArray[1] = car2;
		
		Car car3 = new Car();
		car3.changeGear('D');
		carArray[2] = car3;
		
		for (Car car : carArray) {
			System.out.println("car.gear = " + car.gear);
		}

	}
}



