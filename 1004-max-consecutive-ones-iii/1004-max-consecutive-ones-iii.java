class Solution {
    public int longestOnes(int[] nums, int k) {
        // int maxLen=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int zeros=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]==0) zeros++;
        //         if(zeros<=k)
        //         {
        //             maxLen=Math.max(maxLen,j-i+1);
        //         }
        //         else break;
        //     }
        // }
        // return maxLen;


        int maxLen=0,left=0,right=0,zeros=0;
        while(right<nums.length)
        {
            if(nums[right]==0) zeros++;
            while(zeros>k)
            {
                if(nums[left]==0)
                {
                    zeros--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;

    }
}