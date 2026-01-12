class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            while(left<right &&!isVowel(a[left])) left++;
            while(left<right && !isVowel(a[right]))right--;
            if(left<right)
            {
                char temp=a[right];
                a[right]=a[left];
                a[left]=temp;
                left++;
                right--;
            }
            
        }
        return new String(a);
    }
    public boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}