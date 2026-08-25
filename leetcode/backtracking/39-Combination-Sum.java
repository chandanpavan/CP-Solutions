class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(candidates,0,target,list,new ArrayList<>());
        return list;
    }
    public static void recursion(int[] arr, int index, int target, List<List<Integer>> list, ArrayList<Integer> ds){
        if (index == arr.length) {
            if (target == 0) {
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            recursion(arr, index, target-arr[index], list, ds);
            ds.remove(ds.size()-1);
        }
        recursion(arr, index+1, target, list, ds);
    }
}