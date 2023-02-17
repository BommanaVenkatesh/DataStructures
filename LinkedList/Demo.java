package LinkedList;

public class Demo {
	public static void main(String[] args) {
		Node first=null;
		first=new Node(10,null);
		first.next=new Node("Venky",null);
		first.next.next=new Node(20,null);
		Node curr=first;
		while(curr!=null)
		{
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
}
