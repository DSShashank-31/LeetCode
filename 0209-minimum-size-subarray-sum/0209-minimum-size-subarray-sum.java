class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLen=Integer.MAX_VALUE;
        int left=0,right=0,sum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int currSum=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
               
        //        currSum+=nums[j];
        //         if(currSum>=target)
        //         {
        //             minLen=Math.min(minLen,j-i+1);
        //            break;
        //         }
        //     }
        // }
        // return minLen==Integer.MAX_VALUE?0:minLen;

        while(right<nums.length)
        {
            sum+=nums[right];
            
            while(sum>=target)
            {
                minLen=Math.min(minLen,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}