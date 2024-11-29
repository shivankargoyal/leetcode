class Solution {
    public boolean isBalanced(String num)
    {
        String[] arr=num.split("");
        int sumo=0;
        int sume=0;
        if(arr.length==0 || arr.length==1)
        {
            return true;
        }
        for(int i=0;i<arr.length;i=i+2)
        {
            char c=arr[i].charAt(0);
            int temp=c-'0';
            sumo=sumo+temp;
            // System.out.println(temp);
        }
        for(int i=1;i<arr.length;i=i+2)
        {
            char c=arr[i].charAt(0);
            int temp=c-'0';
            // System.out.println(temp);
            sume+=temp;
        }
        if(sume!=sumo)
        {
            return false;
        }
        return true;
    }
}