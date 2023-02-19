package ArrayList;

public class Test1 {

	public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add("Venky");
        l.add(9704168253l);
        l.add(4.56f);
        l.add(true);
        l.add('B');
        int size=l.size();
		{
			System.out.println("Venky");		}
        Object o1=l.get(1);
        System.out.println("Size of ArrayLis is "+size);
        System.out.println("Object at index 1 is "+o1);
        for(int i=0;i<size;i++)
        {
        	System.out.println(l.get(i));
        }
	}

}
