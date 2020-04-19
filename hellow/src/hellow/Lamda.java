package hellow;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class product{
	int id;
	String name;
	float salary;
	public  product(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class Lamda {
	

	public static void main(String[] args) {
		int arr[]= {1,2,23,4,4,5};
		int total=0;
		for (int i: arr) {
			 total=total+i;
		}
		System.out.println(total);
			}
	

}
