class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        yee=[]
        nee=[]
        ysum=0
        nsum=0

        for i in range(n+1):
            if i%m==0:
                yee.append(i)
            else:
                nee.append(i)

        for i in range(len(yee)):
            ysum=ysum+yee[i]
        
        for i in range(len(nee)):
            nsum=nsum+nee[i]
        
        return nsum-ysum
        