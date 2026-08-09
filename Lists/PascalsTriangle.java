// Leetcode 118. Pascal's Triangle
// Difficulty: easy

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int num) {
       List<List<Integer>> pascal = new ArrayList();
       for(int i=0;i<num;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    List<Integer> preNum =pascal.get(i-1);
                    row.add(preNum.get(j)+ preNum.get(j-1));
                }
            }
            pascal.add(row);
       }
       return pascal;
    }
}