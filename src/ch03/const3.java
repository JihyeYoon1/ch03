package ch03;
import java.util.Scanner;
public class const3 {

	static String name, hobby;
	static int age;

	public const3() {

	}

	public const3(String n) {
		name = n;
	}

	public const3(String n, int a) {
		name = n;
		age = a;
	}

	public const3(String n, int a, String h) {
		name = n;
		age = a;
		hobby = h;
	}

	static void prn() {
		System.out.println(name + age + hobby);
	}

	static void prnh() {
		System.out.println(name + age);
	}

	public static void main(String[] args) {

		const3 c0 = new const3("joe", 27, "singing");
		prn();
		const3 c1 = new const3("Stella", 27);
		prnh();
		const3 c2 = new const3("Jinney", 30, "watching");
		prn();
		const3 c3 = new const3("Jenny", 30, "reading");
		prn();

	}

}
