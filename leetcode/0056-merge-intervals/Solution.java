class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
    
        for(int i=0; i<n; i++){
            int[] curr = intervals[0];
            if(curr[1] > intervals[i][0]){
                curr[1] = Math.max(curr[1], intervals[i][1]);
            }else{
                list.add(curr);
                curr = intervals[i];
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}