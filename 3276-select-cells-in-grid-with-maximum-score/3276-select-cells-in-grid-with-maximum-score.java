class Solution {
    public int maxScore(List<List<Integer>> grid) {
        List<List<Integer>> list = new ArrayList<>();
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.getFirst().size(); col++) {
                list.add(List.of(row, col));
            }
        }
        list.sort((l1, l2) -> {
            int r1 = l1.getFirst(), c1 = l1.getLast();
            int r2 = l2.getFirst(), c2 = l2.getLast();
            return Integer.compare(grid.get(r1).get(c1),
                    grid.get(r2).get(c2));
        });
        int n = list.size();
        int[][] dp = new int[n + 1][1 << grid.size()];
        for (int i = n - 1; i >= 0; i--) {
            for (int mask = (1 << grid.size()) - 1; mask >= 0; mask--) {
                int row = list.get(i).getFirst();
                int col = list.get(i).getLast();
                int val = grid.get(row).get(col);
                dp[i][mask] = dp[i + 1][mask];
                if (((mask >> row) & 1) == 0) {
                    int l = i, r = n - 1, pos = r + 1;
                    while (l <= r) {
                        int m = (l + r) >> 1;
                        int row_mid = list.get(m).getFirst();
                        int col_mid = list.get(m).getLast();
                        int val_mid = grid.get(row_mid).get(col_mid);
                        if (val_mid > val) {
                            pos = m;
                            r = m - 1;
                        } else l = m + 1;
                    }
                    dp[i][mask] = Math.max(dp[pos][mask ^ (1 << row)] + val, dp[i][mask]);
                }
            }
        }
        return dp[0][0];
    }
}