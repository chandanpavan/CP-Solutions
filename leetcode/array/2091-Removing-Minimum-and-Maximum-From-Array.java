class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(nums.length == 1) return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i+1;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i+1;
            }
        }

        int res1 = Math.min(Math.max(maxIndex,minIndex), Math.max(n-maxIndex+1, n-minIndex+1));
        int res2 = Math.min(minIndex+n-maxIndex+1, maxIndex+n-minIndex+1);
        return Math.min(res1,res2);
    }
}