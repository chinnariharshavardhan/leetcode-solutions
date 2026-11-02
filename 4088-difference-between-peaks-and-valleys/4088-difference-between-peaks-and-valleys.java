class Solution {
    public int peakValleyDifference(int[] nums) {
        ArrayList<Integer> peak=new ArrayList<>();
        ArrayList<Integer> valley=new ArrayList<>();
        int p=0,v=0;
        for(int i=1;i<nums.length-1;i++){
            if((nums[i] > nums[i - 1]) && (nums[i] > nums[i + 1])){
                peak.add(nums[i]);
            }
            if((nums[i] < nums[i - 1]) && (nums[i] < nums[i + 1])){
                valley.add(nums[i]);
            }
        }
        int ps=0;
        int vs=0;
        for(int a:peak){
            ps+=a;
        }
        for(int b: valley){
            vs+=b;
        }
        return ps-vs;
    }
}