class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        for(int i=0; i<interval.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i+1;
            while(j<n && intervals[j][0] )
        }
    }
}