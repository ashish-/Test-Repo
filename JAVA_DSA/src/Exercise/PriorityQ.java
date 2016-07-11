package Exercise;

import java.util.PriorityQueue;
import java.util.regex.Pattern;

public class PriorityQ {

	static int minCost(int[] a, int n)
	{
		int res = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>(10);
		for(int i=0;i <n; i++)
			queue.add(a[i]);
		while(queue.size()>1){
			
			int first = queue.poll();
			int second = queue.poll();
			
			res += first + second;
			System.out.println(res);
			queue.add(first+second);
		}
		
		
		return res;
		
	}
	public static void main(String[] args) {
		//String  str = "004.034556";
		//String parts[] = str.split(Pattern.quote("."));
		//System.out.println(parts[0]+ " "+parts[1]);
		
		int len[] = {4, 3, 2, 6};
		
		System.out.println(minCost(len,4));
		
		
		
		
		/*PriorityQueue<String> queue = new PriorityQueue<>(10);
		queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while(queue.size()!=0)
        	System.out.println(queue.remove());*/
	}
	
}
