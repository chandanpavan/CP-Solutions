class Solution {
    public int totalNumbers(int[] digits) {
        int[] frequency = new int[10];
        for(int i=0;i<digits.length;i++){
            frequency[digits[i]]++;
        }
        int count = 0;
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k+=2){
                    frequency[i]--;
                    frequency[j]--;
                    frequency[k]--;

                    if(frequency[i] >= 0 && frequency[j] >= 0 && frequency[k] >= 0){
                        count++;
                    }
                    frequency[i]++;
                    frequency[j]++;
                    frequency[k]++;
                }
            }
        }
        return count;
    }
}