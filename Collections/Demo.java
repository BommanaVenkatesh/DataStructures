package Collections;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(30);
		System.out.println("a1="+a1);
		ArrayList a2=new ArrayList();
		a2.add(20);
		a2.addAll(a1);
		System.out.println("a2="+a2);
		System.out.println(a2.contains(20));
	}
}
