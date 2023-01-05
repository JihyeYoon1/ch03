package ch03;

import java.util.Scanner;

class Card {
	
	static int width, height; //클래스 변수 = 정적변수(공통변수)
	int number; //인스턴스 변수
	String kind; //인스턴스 변수

	static void text() { //클래스 메서드 = 정적메서드 
		System.out.println("가로\t세로\t종류\t번호");
	}
	void prn() {
		System.out.println(width + "\t" + height + "\t" + kind+ "\t" + number );
	}

public Card(int w, int h, int n, String k) {
	width = w; height = h; number=n; kind=k;
}

}


public class CardEx {
	public static void main(String[] args) {
		Card c1 = new Card(50,80,7,"스페이드");
		Card c2 = new Card(50,80,7,"스페이드");
		Card c3 = new Card(50,80,7,"스페이드");
		
//		Card.width = 50; //클래수 변수이기에 변수생성없이 바로 사용가능!
//		Card.height = 80;
//		
//		c1.kind ="스페이드";
//		c1.number = 7;
//		
//		c2.kind ="하트";
//		c2.number=10;
//		
//		c3.kind ="클로버";
//		c3.number=3;
		
		Card.text();//클래수 메서드이기에 변수생성없이 바로 사용가능!
		c1.prn();
		c2.prn();
		c3.prn();
		
		  System.out.println("문자를 입력해라");
		   Scanner sc = new Scanner(System.in);
		   String ch = sc.nextLine();
		   
		   System.out.println("숫자를 입력해라");
		   Scanner scn = new Scanner(System.in);
		   int scn2 = scn.nextInt();
		   
		   int ea = ch.length();
		   for(int i=0; i<ea; i++) {
			int aa =  (char)(ch.charAt(i) + scn2);
			   System.out.print((char)(ch.charAt(i) + scn2));
		   }
	}

}
