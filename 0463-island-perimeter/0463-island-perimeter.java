class Solution {
    public int help(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 0;
        if (grid[i][j] == 0 || visited[i][j]) return 0;
        
        visited[i][j] = true;
        
        int perimeter = 4;

       
        if (i > 0 && grid[i - 1][j] == 1) perimeter--; 
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) perimeter--; 
        if (j > 0 && grid[i][j - 1] == 1) perimeter--; 
        if (i + 1 < grid.length && grid[i + 1][j] == 1) perimeter--; 

        perimeter += help(grid, visited, i + 1, j); 
        perimeter += help(grid, visited, i, j + 1); 
        perimeter += help(grid, visited, i - 1, j); 
        perimeter += help(grid, visited, i, j - 1); 

        return perimeter;
    }

    public int islandPerimeter(int[][] grid) {
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                
                if (grid[i][j] == 1 && !visited[i][j]) {
                    ans = Math.max(ans, help(grid, visited, i, j));
                }
            }
        }

        return ans;
    }
}