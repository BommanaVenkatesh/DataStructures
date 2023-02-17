package LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
          LinkedList l=new LinkedList();
          for(int i=1;i<=10;i++)
          {
        	  int n=i*10;
        	  l.add(n);
          }
          //l.remove(6);
          for(int i=0;i<l.size();i++)
          {
        	  System.out.print(l.get(i)+" ");
          }
          System.out.println();
          System.out.println("size = "+l.size());
         l.reverse();
         for(int i=0;i<l.size();i++)
         {
       	  System.out.print(l.get(i)+" ");
         }
	}
}
