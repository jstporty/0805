
public class Derived extends Base {
	String name = "박지민"; // overshadow variable

	void print() {// override method
		System.out.println("나는 자식의 메소드");
	}

	void display() {

//		System.out.println("나의이름은="+this.name);
//		System.out.println("보모님의 이름은="+super.name);
		this.print();
		super.print();

	}
}
