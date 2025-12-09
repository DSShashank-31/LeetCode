class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>='a' && c<='z')||(c>='0' && c<='9'))
            {
                result.append(c);
            }
        }
        char[] a=result.toString().toCharArray();
        int i=0;
        int j=result.length()-1;
        while(i<j)
        {
            if(a[i]!=a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}