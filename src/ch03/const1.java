package ch03;
public class const1 { //생성도 여러개일때 : 매개변수 갯수 다르거나, 데이터 형 달라야함
	
	public const1() {
		System.out.println();
	}
	public const1(int x) {
		System.out.println(x);
	}
	public const1(int x, int y) {
		System.out.println(x+y);
	}
	public const1(String name) {
		System.out.println(name);
	}
	static void prn() {
		System.out.println("실행");
	}
	
	
	
	
	public static void main(String[] args) {

		const1 c1 = new const1(7);
//		const1.prn(); = prn();와 같다. 
		prn();
	}
}
