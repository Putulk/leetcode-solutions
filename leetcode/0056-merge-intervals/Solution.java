class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();

        for(int interval: intervals){
            curr[] = interval[0];
            if(curr[1] > interval[0]){
                curr[1] = Math.max(curr[1], interval[1]);
            }else{
                list.add(curr);
                curr = interval;
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}