// Leetcode 287. Find the Duplicate Number
// Difficulty: Medium

class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] ans=new boolean[nums.length+1];
        for(int  i : nums){
            if(ans[i]){
                return i;
            }
            ans[i]=true;
        }
        return 0;
    }
}