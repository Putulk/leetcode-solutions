class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            int[]
        }
        return list.toArray(new int[list.size()][]);
    }
}