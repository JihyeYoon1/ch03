package ch03;

public class Car1Ex {

	public static void main(String[] args) {
		//선언 : 클래스명 객체명(참조변수명, reference 변수명) 
		Car1 myCar = new Car1();
		myCar.color = "빨강";
		myCar.displacement = 20000;
		myCar.name = "소나타";
		myCar.speedUp();
		myCar.stop();
		myCar.prn();
		
		Car1 yourCar = new Car1();
		yourCar.color = "노랑";
		yourCar.name = "말두타";
		yourCar.speedUp();
		yourCar.stop();
		yourCar.prn();
		System.out.println("이름 : "+myCar.name );
	}

}
