class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<interval.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i+1;
            while(j<n && intervals[j][0] <= end){
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            list.add(Arrays.asList(start, end));
            i
        }
    }
}