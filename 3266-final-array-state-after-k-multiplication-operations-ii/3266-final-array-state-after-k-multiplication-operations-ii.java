class Solution {
     public long power(long a, long b, long m) {// a^b % m
    long res = 1;
    a %= m;
    while (b > 0) {
      if ((b & 1) != 0) {
        res = (res * a) % m;
        b--;
      } else {
        b >>= 1;
        a = (a * a) % m;
      }
    }
    return res;
  }
    public class pr{
        long a,b;
        public pr(long a,long b){
            this.a=a;
            this.b=b;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if(multiplier==1){
            return nums;
        }
        int n=nums.length;
        long mod=1000000007;


        PriorityQueue<pr> pq=new PriorityQueue<pr>((aa,bb)->{
            if(aa.a==bb.a){
            return (int)(aa.b-bb.b);
            }
            return(int) (aa.a-bb.a);
            });


        long a[][]=new long[n][2],max=0;
        for(int i=0;i<n;i++){
            // a[i][0]=nums[i];
            // a[i][1]=i;
            pq.add(new pr(nums[i],i));
            max=(long)Math.max(max,nums[i]);
        }

        while(k>0){
            pr fr=pq.remove();
            if(fr.a*multiplier >max){
                pq.add(fr);
                break;
            }
            fr.a*=multiplier;
            pq.add(fr);
            k--;
        }
        int ii=0;
        // for(pr x:pq){
        //     a[ii][0]=x.a;
        //     a[ii][1]=x.b;
        //     ii++;
        // }
        while(!pq.isEmpty()){
            pr x=pq.remove();
            a[ii][0]=x.a;
            a[ii][1]=x.b;
            ii++;
        }
        int time=k/n;
        k-=time*n;
        for(int i=0;i<n;i++){
            if(i<k){
                a[i][0]=(a[i][0]*(long)power(multiplier,time+1,mod))%mod;
            }else{
                a[i][0]= (a[i][0]* (long)power(multiplier,time,mod))%mod;
            }
        }




        // Arrays.sort(a,(aa,bb)->(long)aa[1]-(long)bb[1]);
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[(int)a[i][1]]=(int)a[i][0];
        }
        return ans;

    }
}