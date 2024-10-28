class Solution {
    public boolean isValid(String word)
    {
        if(word.length()<3)
        {
            return false;
        }


        int vowel=0,capital=0,small=0;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            int temp=(int)ch;
            if(temp==97 || temp==101 || temp==105 || temp==111 || temp==117 || temp==65 || temp==69 || temp==73 || temp==79 || temp==85)
            {
                if(vowel==0)
                {
                    vowel++;
                    continue;
                }
                else
                {
                    continue;
                }
            }
            if(temp>=65 && temp<=90)
            {
                if(small==0)
                {
                    small++;
                    continue;
                }
                else
                {
                    continue;
                }
            }
            if(temp>=97 && temp<=122)
            {
                if(capital==0)
                {
                    capital++;
                    continue;
                }
                else
                {
                    // System.out.println("skipped "+temp);
                    continue;
                }
            }
            if(temp>=48 && temp<=57)
            {
                continue;
            }
            else
            {
                return false;
            }
        }


        if(vowel!=0 && (capital!=0 || small!=0))
        {
            return true;
        }
        return false;
        
    }
}