package ArrayList;

public class Test3 {

	public static void main(String[] args) {
        ArrayList l=new ArrayList();
        for(int i=1;i<=10;i++)
        {
        	int n=i*10;
        	l.add(n);
        }
        for(int j=0;j<l.size();j++)
        {
        	System.out.print(l.get(j)+" ");
        }
        l.remove(4);//4th index element removed i.e 50
        System.out.println();
        for(int k=0;k<l.size();k++)
        {
        	System.out.print(l.get(k)+" ");
        }
        System.out.println();
        System.out.println("Size of Array List is "+l.size());
        System.out.println(l);
        l.clear();
        System.out.println(l.size());
        System.out.println(l);
        
	}
}
