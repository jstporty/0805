import java.util.Date;

public class Car {
	private String name;
	private int Price;
	private String maker;
	private Date today;
	private final double PI  ;

	public Car(String name, int price, String maker) {
		// super();//써도되고 안써도됨ㅋ..
		this.name = name;
		Price = price;
		this.maker = maker;
		//this.PI=3.141596;
		System.out.println("방금 객체가 생성되었습니다.");

	}

	{// initialization Block
		System.out.println("Hello World");
		this.today= new Date();
		this.PI=3.141596;
		
	}
	@Override
	public String toString() {
		return"오늘은"+  this.today+"입니다.";
		
		
	}
}