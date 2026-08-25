class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);

        int res = -1;
        int temp = k;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < temp) continue;
            if(nums[i] == temp) temp += k;
            else{
                res = temp;
                break;
            }
       }
        res = temp;
        return res;
    }
}