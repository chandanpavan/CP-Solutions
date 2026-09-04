class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] maxArr = new int[n];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            maxArr[i] = Math.max(nums[i], max);
            max = Math.max(nums[i],max);
        }

        int[] minArr = new int[n];
        int min = nums[n-1];
        for(int i=n-1;i>= 0;i--){
            minArr[i] = Math.min(nums[i], min);
            min = Math.min(nums[i], min);
        }

        int res = k+1;
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(maxArr[i]-minArr[i] <= k){
                res = i;
                flag = true;
                break;
            }
        }
        if(flag) return res;
        else return -1;
    }
}