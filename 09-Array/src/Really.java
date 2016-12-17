
public class Really {

	public static void main(String[] args) {
		
		int[][] grid;
		grid = null;
		grid = new int[2][3];
		
		System.out.println("幾排" + grid.length);
		System.out.println("幾欄" + grid[0].length);
		
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = (int)(Math.random() * 10);
				System.out.print(grid[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}

}

