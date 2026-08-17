class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            List<Integer> innerList = findNcR(i);
            lists.add(innerList);
        }
        return lists;
    }

    public List<Integer> findNcR(int r){
        int res = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1; i<r; i++){
            res = res*(r-i);
            res = res/(i);
            list.add(res);
        }
        return list;
    }
}