class Solution:
    def summ(self, n: int) -> int:
        ans=0
        while n!=0:
            ans=ans+(n%10)
            n=n//10
        return ans
    def smallestIndex(self, nums: List[int]) -> int:
        for i in range(0,len(nums)):
            if i == self.summ(nums[i]):
                return i
        return -1
        