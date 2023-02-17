package DoubleLinkedList;

public class Test1 {

	public static void main(String[] args) {
		DoubleLinkedList l=new DoubleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}

	}

}
