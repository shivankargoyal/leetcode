class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        l=len(nums)
        arr= []
        for n in nums:
            arr.append(n)
        for n in nums:
            arr.append(n)
        # print(arr)
        return arr
