package ch03;
class Score1 {  // default 는 같은 패키지나 같은 클래스에서 사용 가능
	String name;
	int kor, eng, math; 
	void title() {
		System.out.println("이름\t국어\t영어\t수학\t합계");
	}
	void prn() {
		int sum = kor + eng + math; // 지역변수 : 메서드 안에서만 사용 가능
		System.out.println(name+"\t"+kor+"\t"+math+"\t"+sum+"\t"+sum/3);
	}
}
public class Score1Ex {
	public static void main(String[] args) {
		Score1 sc1 = new Score1(); Score1 sc2 = new Score1();
		Score1 sc3 = new Score1(); Score1 sc4 = new Score1();
		sc1.name = "보검";  sc1.kor = 78; sc1.eng = 89; sc1.math = 66;
		sc2.name = "로제";  sc2.kor = 77; sc2.eng = 99; sc2.math = 44;
		sc3.name = "은우";  sc3.kor = 45; sc3.eng = 67; sc3.math = 88;
		sc4.name = "제니";  sc4.kor = 88; sc4.eng = 44; sc4.math = 55;
		sc1.title(); sc1.prn(); sc2.prn();  sc3.prn(); sc4.prn();	
		
	}
}
