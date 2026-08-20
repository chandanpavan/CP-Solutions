class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int pointer = 0;
        int res =0 ;
        for(int i=0;i<requests.length;i++){
            if(requests[i] > pointer){
                res += requests[i]-pointer;
                pointer = requests[i];
            }
            else{
                res += pointer-requests[i];
                pointer = requests[i];
            }
        }
        return res;
    }
}