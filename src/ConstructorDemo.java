
public class ConstructorDemo {
	public static void main(String[] args) {
		Car car = new Car("sonata", 30_000_000, "hyundai Motors");
		System.out.println(car);//==System.out.println(car.toString());
	}
}
/*
*생성자의 역할은 멤버변수 또는 멤버 상수의 초기화
*생성자를 통해서 또는 initialization block을 통해서 초기화한다
*
*/