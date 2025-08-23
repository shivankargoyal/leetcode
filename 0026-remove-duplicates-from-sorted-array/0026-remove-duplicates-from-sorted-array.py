class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=0
        l=len(nums)
        for j in range(l):
            if nums[i]!=nums[j]:
                i+=1
                nums[i]=nums[j]
        return i+1