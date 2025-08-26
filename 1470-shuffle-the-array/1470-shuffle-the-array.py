class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        if len(nums)==1 or len(nums)==2:
            return nums
        arr=[]
        for i in range(n):
            arr.append(nums[i])
            arr.append(nums[n+i])
        return arr

