class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return 0;
        }
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<n-1;i++){
            int value=Math.abs(nums[i]-nums[i+1]);
            if(value>max){
                max=value;
            }
        }
        return max;
    }
}