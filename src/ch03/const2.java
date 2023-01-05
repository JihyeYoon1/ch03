package ch03;


public class const2 {
	static String color, kind;
	static int displacement;
	
	public const2() {}
	
	public const2(String c, int d, String k){
		color = c; displacement = d; kind = k;
	}		
	static void prn() {
		System.out.println(color + displacement + kind);
	}
		
		
	
	
	
	public static void main(String[] args) {
		const2 c2 = new const2("red", 300, "bmw");
		prn();
		const2 c3 = new const2("blue", 1300, "volvo");
		prn();
		const2 c4 = new const2("purple", 2000, "benz");
		prn();
		const2 c5 = new const2(); //이렇게 매개변수 없이 생성하고 싶으면 defualt 생성자 내가 따로 만들기! (c5전용임)
	}

}
