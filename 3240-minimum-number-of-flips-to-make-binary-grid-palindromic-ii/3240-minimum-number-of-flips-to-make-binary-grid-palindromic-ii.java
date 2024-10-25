class Solution {
    public int minFlips(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        // Process each 2x2 block of the grid
        for(int i = 0; i < m/2; i++) {
            for(int j = 0; j < n/2; j++) {
                int cnt = 0;
                // Count the number of 1s in the current 2x2 block
                cnt += grid[i][j];
                cnt += grid[m-1-i][j];
                cnt += grid[i][n-1-j];
                cnt += grid[m-1-i][n-1-j];

                // Calculate flips needed to make all cells the same
                ans += Math.min(cnt, 4-cnt);
            }
        }

         // Handle center row if the number of rows is odd
        int diff = 0;
        int p0 = 0;
        int p1 = 0;
        if(m%2==1) {
            for(int j = 0; j < n/2; j++) {
                if(grid[m/2][j] != grid[m/2][n-j-1]) diff++;
                else {
                    if(grid[m/2][j] == 0) p0++;
                    else p1++;
                }
            }
        }
        if(n%2==1) {
            for(int i = 0; i < m/2; i++) {
                if(grid[i][n/2] != grid[m-i-1][n/2]) diff++;
                else {
                    if(grid[i][n/2] == 0) p0++;
                    else p1++;
                }
            }
        }

         // Adjust for the center cell if both dimensions are odd
        if(n%2==1 && m%2==1) {
            if(grid[m/2][n/2]==1) ans++;
        }

        // Calculate the minimum number of additional flips needed for center row and column
        int ans1 = Integer.MAX_VALUE;
        if(diff%2 == p1%2) {
            ans1 = diff;
        } else {
            if(diff%2==0) {
                if(diff==0) {
                    ans1 = 2;
                } else {
                    ans1 = diff;
                }
            } else {
                ans1 = diff;
            }
        }

        return ans + ans1;
    }
}