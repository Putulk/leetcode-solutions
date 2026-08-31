class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            int[] curr = intervals[i];
            if(curr[1] > intervals[i][0])

        }
        return list.toArray(new int[list.size()][]);
    }
}