package hellow;

import java.io.IOException;

class multi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) 
		{
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
class Multitherading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		multi m=new multi();
		multi m1=new multi();
		multi m2=new multi();
		m.start();
		m.join();
		m1.start();
		m1.join();
		m2.start();
	}

}
