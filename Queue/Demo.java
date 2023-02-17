package Queue;

public class Demo {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		int n=q.size();
		System.out.println(n);
		System.out.println(q.peak());
		System.out.println(q.peak());
		while(!q.isEmpty())
		{
			System.out.print(q.poll()+" ");
		}
	}
}
