package hellow;
import java.io.*;
class ser implements Serializable{
	int id;
	String name;
	public ser(int id,String name) {
		this.name=name;
		this.id=id;
		
	}
}
class Varargs {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\node\\java.txt");
		ObjectInputStream out=new ObjectInputStream(fin);
		ser s=(ser)out.readObject();
		System.out.println(s.id+s.name);
	}

}
