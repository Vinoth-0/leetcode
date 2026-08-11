// Leetcode 56. Merge Intervals
// Difficulty: Medium

class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <=1) {
            return new int[0][];
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> m = new ArrayList<>();
        int c[] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= c[1]){
                c[1] = Math.max(c[1], intervals[i][1]);

            }else{
                m.add(c);
                c = intervals[i];
            }
        }
        m.add(c);
        return m.toArray(new int[m.size()][]);
    }
}
