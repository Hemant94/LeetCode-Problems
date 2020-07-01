import java.util.stream.IntStream;

public class LC15 {
//https://leetcode.com/problems/island-perimeter/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[][] {  {  0,  1, 0, -0 },
            {  1, 1,  1,  0 },
            { 0, 1,  0, 0 },
            { 1, 1,  0, 0 }
         };
         
         System.out.println(islandPerimeter(arr));
	}
	
	public static int islandPerimeter(int[][] grid) {
        return IntStream.range(0, grid.length)
                .flatMap(row -> IntStream.range(0, grid[row].length)
                        .filter(col -> grid[row][col] != 0)
                        .map(col -> 4 - (col != 0 && grid[row][col - 1] != 0 ? 2 : 0)
                                      - (row != 0 && grid[row - 1][col] != 0 ? 2 : 0)))
                .sum();
    }
	

}
