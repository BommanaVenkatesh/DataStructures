package DoubleLinkedList;

public class DoubleLinkedList {
     private Node first=null;
     private int count=0;
     public void add(Object e)
     {
    	 if(first==null)
    	 {
    		first= new Node(e,null,null);
    		count++;
    		return;
    	 }
    	 Node curr=first;
    	 while(curr.next!=null)
    	 {
    		 curr=curr.next;
    	 }
    	 curr.next=new Node(e,null,curr);
    	 count++;
     }
     public int size()
     {
    	 return count;
     }
     public Object get(int index)
     {
    	 if(index<=-1 || index>=size())
    	 {
    		 throw new IndexOutOfBoundsException();
    	 }
    	 Node curr=first;
    	 for(int i=0;i<index;i++)
    	 {
    		 curr=curr.next;
    	 }
    	 return curr.ele;
     }
     public void add(int index,Object e)
     {
    	 if(index<=-1 || index>=size())
    	 {
    		 throw new IndexOutOfBoundsException();
    	 }
    	 if(index==0)
    	 {
    		 first=new Node(e,first,null);
    		 count++;
    		 return;
    	 }
    	 Node curr=first;
    	 for(int i=1;i<index;i++)
    	 {
    		curr=curr.next; 
    	 }
    	 Node n=new Node(e,curr.next,curr);
    	 curr.next.prev=n;
    	 curr.next=n;
    	 count++;
     }
}
