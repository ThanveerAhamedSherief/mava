package hellow;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Trycatch {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//try {
//	int i=50/0;
//	System.out.println(i);
//}
//catch(ArithmeticException e){
//	System.out.println("the numbers cannot divided by zero"+e);
//	
//}
		  PrintWriter pw;  
	        try {  
	            pw = new PrintWriter("jtp.txt"); //may throw exception   
	            pw.println("saved");  
	        }  
	// providing the checked exception handler  
	 catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        }         
	    System.out.println("File saved successfully");  
	}

}
