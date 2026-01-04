class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String s1=arr[arr.length-1];
        int count=0;
        for(char ch:s1.toCharArray())
            count++;
        return count;
    }
}