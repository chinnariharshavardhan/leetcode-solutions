class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int x = 0, y = 0;
        int lastX = 0, lastY = 0;

        while (x >= 0 && x < m && y >= 0 && y < n) {

            if (visited[x][y]) {
                break;
            }

            visited[x][y] = true;

            lastX = x;
            lastY = y;

            char ch = grid[x][y];

            if (ch == 'L') y--;
            else if (ch == 'R') y++;
            else if (ch == 'U') x--;
            else if (ch == 'D') x++;
        }

        return new int[]{lastX, lastY};
    }
}