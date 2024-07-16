class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int res = 0;

        int metal = 0, paper = 0, glass = 0;
        for (int i = 0; i < garbage.length; i++) {
            res += garbage[i].length();
            if (garbage[i].contains("M"))
                metal = i;
            if (garbage[i].contains("P"))
                paper = i;
            if (garbage[i].contains("G"))
                glass = i;
        }

        for (int i = 0; i < travel.length; i++) {
            if (metal > i)
                res += travel[i];
            if (paper > i)
                res += travel[i];
            if (glass > i)
                res += travel[i];
        }

        return res;
    }
}