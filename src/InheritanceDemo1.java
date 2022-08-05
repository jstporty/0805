
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
//		System.out.println(m.salary);    //자기가 자기꺼 찍은거임 ㅋ
//		System.out.println(e.name);    //자기가 자기꺼 찍은거임 ㅋ
		System.out.println(e.salary); // 상속ㅋ

	}
}

class Manager {
	int salary = 1000000;
}

class Employee extends Manager {
	String name = "한지민";

}