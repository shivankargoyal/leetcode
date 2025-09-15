class Solution:
    def checksym(self, i: int, n: int) -> int:
        s=str(i)
        half=n//2
        left=sum(int(s[i]) for i in range(half))
        right=sum(int(s[i]) for i in range(half, n))
        if left== right:
            return 0
        else:
            return 1
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        ans=0
        for i in range(low,high+1):
            if len(str(i)) %2==0:
                if self.checksym(i,len(str(i)))==0:
                    ans+=1
                else:
                    continue
        return ans