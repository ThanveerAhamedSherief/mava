package hellow;
class animal{
	void eat() {
		System.out.println("super class eat");
	}
}
class dog extends animal{
	void eat() {
		System.out.println("subclass");
	}
	void bark() {
		System.out.println("bark");
	}
	void act() {
		this.eat();
		bark();
		eat();
	}
}
public class Super {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
dog d=new dog();
d.act();

	}

}
