class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i+1;
            while(j<n && intervals[j][0] <= end){
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            list.add(new int[]start, end));
            i=j-1;
        }
        return list.toArray(new int[list.size()][]);
    }
}