package hellow;
import java.util.Scanner;
class car{
	static void fullthro(String name) {
		System.out.println("car name is "+name);
	}
	static void speed(int speed) {
		System.out.println(" max speed is "+speed);
	}
}

class Inheritance{
	 public static void main(String a[]) {
		car c=new car();
		c.fullthro("bmw");
		c.speed(100);
	}
}