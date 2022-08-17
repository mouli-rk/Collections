import java.util.*;
public class Queue_Queue {

	public static void main(String[] args) {
		Queue <Integer> q=new ArrayDeque<Integer>();
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
		}
		//Copying remaining elements in queue to stack
		System.out.println("\nExisting elements in Queue : "+q);
	}

}
