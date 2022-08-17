import java.util.*;
public class Queue_stack {

	public static void main(String[] args) {
		Queue <Integer> q=new ArrayDeque<Integer>();
		Stack <Integer> s=new Stack<Integer>();
		int sm=0;
		for(int i=1;i<7;i++)
		 {
			q.add(i);
			sm=sm+i;

		 }
		System.out.println("Elements : "+q);
		
		System.out.println("sum:"+sm);
		System.out.print("Removed Elements : ");
		for(int i=0;i<2;i++)
		{
		    int removedElement=q.remove();
		    System.out.print(removedElement+" ");
		    s.push(removedElement);
		}
		System.out.println("\nExisting elements in stack : "+s);
		
		//Copying remaining elements in queue to stack
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext())
		{
			s.push(itr.next());
		}
		System.out.println("Existing elements in Queue : "+q);
		System.out.println("Elements after copying into stack : "+s);
	}

}
