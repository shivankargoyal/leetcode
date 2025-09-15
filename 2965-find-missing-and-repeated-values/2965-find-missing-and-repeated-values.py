class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        ln=len(grid)
        ln=ln*ln
        sm=(ln*(ln+1))//2
        ans=[]
        visit=set()
        for row in grid:
            for val in row:
                if val not in visit:
                    visit.add(val)
                    sm-=val
                else:
                    ans.append(val)
        ans.append(sm)

        return ans
        