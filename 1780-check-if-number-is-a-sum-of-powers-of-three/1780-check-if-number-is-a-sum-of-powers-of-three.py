class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        if n<=3:
            if n%3==2:
                return False
            elif n%3==1 or n%3==0:
                return True
        maxpow=1
        while maxpow <n:
            maxpow*=3
        maxpow=maxpow//3
        n=n-maxpow
        print(n)
        return self.checkPowersOfThree(n)
            