package LinkedList;

public class LinkedList {
     private Node first=null;
     private int count=0;
     public void add(Object e)
     {
    	 if(first==null)
    	 {
    		 first=new Node(e,null);
    		 count++;
    		 return;
    	 }
    	 Node curr=first;
    	 while(curr.next!=null)
    	 {
    		 curr=curr.next;
    	 }
    	 curr.next=new Node(e,null);
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
    	   Node n=new Node(e,null);
    	   n.next=first;
    	   first=n;
    	   count++;
    	   return;
       }
       Node curr=first;
       for(int i=1;i<index;i++)
       {
    	   curr=curr.next;
       }
       Node n=new Node(e,null);
       n.next=curr.next;
       curr.next=n;
       count++;	
    }
    public void remove(int index)
    {
    	if(index<=-1 || index>=size())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	if(index==0)
    	{
//    		Node curr=first;
//    		curr=curr.next;
//    		first=curr;		
     		first=first.next;
    		count--;
    		return;
    	}
    	Node curr=first;
    	for(int i=1;i<index;i++)
    	{
    		curr=curr.next;
    	}
    	
    	curr.next=curr.next.next;
    	count--;
//    	Node curr1=first;
//    	Node curr=first;
//    	for(int i=1;i<=index+1;i++)
//    	{
//    		curr=curr.next;
//    		if(i<index)
//    			curr1=curr1.next;
//    	}
//    	curr1.next=curr;
//    	count--;
    }
    public void reverse()
    {
    	Node curr=first;
    	Node prev=null;
    	Node next=null;
    	while(curr!=null)
    	{
    		next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	first=prev;
    }
}
