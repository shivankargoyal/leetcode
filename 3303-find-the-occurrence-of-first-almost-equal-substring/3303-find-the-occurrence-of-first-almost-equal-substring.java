class Solution {
    public int minStartingIndex(String s, String pattern) {
        int n = s.length();
        int m = pattern.length();
        int[] z1 = z_function(pattern + s);
        int[] z2 = z_function(new StringBuilder(s + pattern).reverse().toString());
        for(int i = 0; i <= n - m; i++) {
            if(z1[m + i] + 1 + z2[n - i] >= m) {
                return i;
            }
        }
        return -1;
    }
    public static int[] z_function(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;

        for (int i = 1; i < n; i++) {
            if (i < r) {
                z[i] = Math.min(r - i, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] > r) {
                l = i;
                r = i + z[i];
            }
        }
        return z;
    }
}