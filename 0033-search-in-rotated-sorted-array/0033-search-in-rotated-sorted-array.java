class Solution {
    public int search(int[] nums, int target) {
        int result=-1;
        int i=0;
        for(int num:nums)
        {
            if(num==target)
            {
                result=i;
            }
            i++;
        }
        return result;
    }
}