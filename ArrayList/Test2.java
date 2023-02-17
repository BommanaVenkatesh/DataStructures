package ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=1;i<=5;i++)
		{
			int n=i*10;
			l.add(n);
		}
		for(int j=0;j<l.size();j++)
		{
			System.out.print(l.get(j)+" ");
		}
		System.out.println();
		l.add(1,60);
		for(int k=0;k<l.size();k++)
		{
			System.out.print(l.get(k)+" ");
		}
	}
}
