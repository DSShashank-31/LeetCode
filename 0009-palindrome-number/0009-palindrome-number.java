class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int copy=x;
        while(x>0)
        {
            sum=x%10+(sum*10);
            x/=10;
        }
        return sum==copy;
    }
}