class Solution {
public:
    int findMin(vector<int>& nums) {
        int minimum=nums[0];
        for(int num:nums)
        {
            if(num<minimum)
            {
                minimum=num;
            }
        }
        return minimum;
    }
};