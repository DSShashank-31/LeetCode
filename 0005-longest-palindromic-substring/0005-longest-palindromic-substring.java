class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=2) return String.valueOf(s.charAt(0));
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++)
            {
                if(isPallindrome(s,i,j))
                {
                    String subString=s.substring(i,j+1);
                    if(subString.length()>longest.length())
                    {
                        longest=subString;
                    }
                }
            }
        }
        return longest;
    }
    public boolean isPallindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}