// Leetcode 75. Sort Colors
// Difficulty: Medium

class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int val:nums){
            if(val==0){
                zero++;
            }else if(val==1){
                one++;
            }else{
                two++;                
            }
        }
        int ind=0;
        for(int i=0;i<zero;i++){
            nums[ind]=0;
            ind++;
        }
        for(int i=0;i<one;i++){
            nums[ind]=1;
            ind++;
        }
        for(int i=0;i<two;i++){
            nums[ind]=2;
            ind++;
        }
    }
}