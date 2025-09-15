class Solution:
    def findGCD(self, nums: List[int]) -> int:
        nums.sort()
        ln=len(nums)
        num1=nums[0]
        num2=nums[ln-1]
        return gcd(num1,num2)
        