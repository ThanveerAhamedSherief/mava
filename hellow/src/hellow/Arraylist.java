package hellow;
import java.util.*;
import java.io.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList book=new ArrayList();
		book.add("c");
		book.add("c++");
		book.add("java");
		book.add(0,"python");
		Iterator it=book.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
