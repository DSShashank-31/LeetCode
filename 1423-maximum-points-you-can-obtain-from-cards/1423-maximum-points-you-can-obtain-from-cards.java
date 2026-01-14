class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxScore=Integer.MIN_VALUE;
        for(int i=0;i<=k-1;i++){
            leftSum+=cardPoints[i];
        }
        maxScore=leftSum;
        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[right];
            right--;
            maxScore=Math.max(maxScore,leftSum+rightSum);
        }

        return maxScore;
    }
}