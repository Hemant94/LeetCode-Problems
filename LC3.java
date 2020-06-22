import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LC3 {
	//https://leetcode.com/problems/task-scheduler/
	public static int leastInterval(char[] tasks, int n) {
        Map<Character, Long> freq = IntStream.range(0, tasks.length).
                mapToObj(i -> tasks[i]).collect(Collectors.groupingBy(y -> y, Collectors.counting()));
        Map<Character, Integer> interval = freq.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e->-1));

        int res = 0;
        int count = tasks.length;

        while(count != 0) {
            Character ch;
            final int r = res;

            Optional<Map.Entry<Character, Long>> op =  freq.entrySet().stream().filter(e -> e.getValue() > 0 && (interval.get(e.getKey()) == -1 || (r - interval.get(e.getKey())) > n)).collect(Collectors.maxBy(Map.Entry.comparingByValue()));
            if(op.isPresent()) {
                --count;
                ch = op.get().getKey();
                freq.put(ch, freq.get(ch)-1);
                interval.put(ch, res);
            }
            ++res;
        }
        return res;
    }
	public static void main(String[] args) {
		char[] c= new char[] {'A','A','A','B','B','B'};
		int n= 0;
		System.out.println(leastInterval(c, n));
	}
}
