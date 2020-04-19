package hellow;
import java.util.*;
public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int tot=0;
	int[] num= {1,2,3,4,5};
	for (int i=0;i<num.length;i++) {
		tot=num[i]+tot;
		System.out.println(tot);
	}
	}

}
