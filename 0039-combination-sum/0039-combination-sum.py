class Solution:
    def combinationSum(self, candidates, target):
        candidates.sort()   # sort to enable early stopping
        result = []

        def backtrack(start, total, comb):
            if total == target:
                result.append(list(comb)) # record valid comb
                return
            if total > target:
                return  # overshoot -> stop exploring path
            
            for i in range(start, len(candidates)):
                comb.append(candidates[i])
                backtrack(i, total + candidates[i], comb)  # allow reuse
                comb.pop()

        backtrack(0, 0, [])
        return result