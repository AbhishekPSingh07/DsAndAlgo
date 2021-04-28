package algortithms;
import java.util.*;

public class SlidingWindow {

	public static void main(String[] args) {
		
		

	}
	class solution{
		public int[] maxSlidingWindow(int[]a,int k) {
			int n = a.length;
			if(n <= 1)return a;
			Deque <Integer>dq = new LinkedList<>();
			int ans[] = new int[n-k+1];
			for(int i =0;i<k;i++) {
				while(!dq.isEmpty()&& a[dq.peekLast()] > a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			for(int i = 0;i<n;i++) {
				ans[i-k] = a[dq.peekFirst()];
				
				while(!dq.isEmpty() && a[dq.peekFirst()] <= a[i-k]) {
					dq.removeFirst();
				}
				while(!dq.isEmpty()&& a[dq.peekLast()] > a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			int i = 0;
			ans[i -k] = a[dq.peekFirst()];
			return ans;
		}
	}

}
