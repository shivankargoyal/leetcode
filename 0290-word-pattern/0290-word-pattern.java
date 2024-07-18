class Solution
{
    public boolean wordPattern(String pattern, String s)
    {
        Map<Character, String> hmap = new HashMap<>();
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
        {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++)
        {
            char currentChar = pattern.charAt(i);
            String currentWord = arr[i];
            if (hmap.containsKey(currentChar))
            {
                if (!hmap.get(currentChar).equals(currentWord))
                {
                    return false;
                }
            }
            else
            {
                if(hmap.containsValue(currentWord))
                {
                    return false;
                }
                hmap.put(currentChar, currentWord);
            }
        }
        return true;
    }
}