package hellow;
import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Bclass{
	String name;
	int age;
	public void company(String n,int a) {
		this.name=n;
		this.age=a;
		System.out.println("your name is "+name+" and your age is "+age);
		}
	public void login() {
		int attempt=3;
		System.out.println("enter your name :");
		Scanner sc=new Scanner(System.in);
		String user=sc.next();
		
		if(user=="veer") {
				String pass=sc.next();
			System.out.println("enter your password :");
			if(pass=="veer") {
				System.out.println("login successfull");
			}
			else {
				System.out.println("incorrect password");
			}
		}
		else {
	attempt--;
			System.out.println("remaining attempts "+attempt);
		}
	}
		
	}

class Array
{
public static void main(String args[])
	{
	Bclass obj=new Bclass();
	obj.company("thanveer",23);
	obj.login();
	}
}
//