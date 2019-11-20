import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class perfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int res = perfSq(n);
		System.out.println(res);
	}

	private static int perfSq(int n) {
		// TODO Auto-generated method stub
		
		 Queue<Integer> q = new LinkedList<>();
		    Set<Integer> visited = new HashSet<>();
		    q.offer(0);
		    visited.add(0);
		    int depth = 0;
		    while(!q.isEmpty()) {
		        int size = q.size();
		        depth++;
//		        while(size-- > 0) {
		            int u = q.poll();
		            for(int i = 1; i*i <= n; i++) {
		                int v = u+i*i;
		                if(v == n) {
		                    return depth;
		                }
		                if(v > n) {
		                    break;
		                }
		                if(!visited.contains(v)) {
		                    q.offer(v);
		                    visited.add(v);
		                }
		            }
		        
		    }
		    return depth;
	}

}
