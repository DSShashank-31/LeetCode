class Solution {
public:
    bool search(vector<int>& nums, int target) {
        bool flag=false;

        for(int num:nums)
        {
            if(num==target)
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
};