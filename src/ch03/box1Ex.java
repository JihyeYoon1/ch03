package ch03;

public class box1Ex {

	public static void main(String[] args) {
//		String name = "홍길동";
//		
//		int family = 100;
//		family += 50;
//		System.out.println(name+"의 식구는"+(++family)+"명입니다."); //151명 
		
		int[]a= {76,45,34,89,100,50,90,92};
		int temp;
		for(int i=0; i<a.length; i++) { //
			for(int j=i+1; j<a.length; j++) { //
				if(a[i] > a[j]) {
					temp = a[i]; //
					a[i] = a[j];
					a[j] = temp; 
				}
			}
		}
		for(int i : a) { //
			System.out.println(i);
		}
		
		
		box1 b = new box1();
		b.channel = 10;
		b.channelUp();
		System.out.println("b의 채널 : " +b.channel);
		box1 b2 = new box1();
		b2.channel = 200;
		b2.channelDown();
		System.out.println("b2의 채널 : "+b2.channel);
		
		
		
		
		
		
	}

}
