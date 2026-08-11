// Leetcode 31. Next Permutation
// Difficulty: Medium

class Solution {
    public void nextPermutation(int[] num) {
        int i= num.length-2;
        while(i>=0 && num[i]>= num[i+1])i--;
        if(i>=0){
            int j=num.length-1;
            while(j>=0 && num[j] <= num[i] )j--;
            swap(num,i,j);
        }
        reverse(num,i+1);
    }
    public void swap(int []num,int i,int j){
        int temp = num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public void reverse(int [] num , int start){
        int end=num.length-1;
        while(start < end){
            swap(num,start,end);
                start++;
                end--;
        }
    }
}