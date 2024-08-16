class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    arr.add(arr1[j]);
                }
            }
        }
        ArrayList<Integer> rest=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(!arr.contains(arr1[i]))
            {
                rest.add(arr1[i]);
                // System.out.println(arr1[i]);
            }
        }
        Collections.sort(rest);
        int [] niw=new int[arr.size()+rest.size()];
        int i=0;
        while(i<arr.size())
        {
            niw[i]=arr.get(i);
            i++;
        }
        int j=0;
        while(j<rest.size())
        {
            niw[i+j]=rest.get(j);
            j++;
        }
        return niw;
    }
}