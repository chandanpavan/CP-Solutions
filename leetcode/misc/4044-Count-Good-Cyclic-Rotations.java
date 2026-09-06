class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        long leftSum = 0;
        long rightSum = 0;

        // doubling the array
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            if(i < n/2) leftSum += nums[i];
            else rightSum += nums[i];
        }
        for(int i=0;i<nums.length;i++){
           list.add(nums[i]);
        }

        int startIndex = 0;
        int midIndex = n/2;
        int cnt = leftSum > rightSum ? 1:0;
        while(startIndex < n-1){
            // iterating over
            rightSum += list.get(startIndex);
            rightSum -= list.get(midIndex);

            leftSum -= list.get(startIndex);
            leftSum += list.get(midIndex);

            startIndex++;
            midIndex++;
            if(leftSum > rightSum) cnt++;
        }
        return cnt;
    }
}