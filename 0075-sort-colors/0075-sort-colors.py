class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        arr=sorted(nums)
        for i in range(len(nums)):
            nums[i]=arr[i]