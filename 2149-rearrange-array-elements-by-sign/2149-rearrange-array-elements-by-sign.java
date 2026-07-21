class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] ans=new int[nums.length];
       int pos=0;
       int neg=1;
       for(int n: nums){
        if(n>=0){
            ans[pos]=n;
            pos+=2;
        }
        else{
            ans[neg]=n;
            neg+=2;
        }
       }
       return ans;
       
    }
   
}
 // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>=0){
        //         pos[]
        //     }
        // }

        // int i=0;
        // int j=i+1;
        // while(j!=nums.lenght){
        //    if((nums[i]>=0 && i%2==0) && (nums[j]<0 && j%2!=0)){
        //     i+=2;
        //     j+=2;
        //    }
        //     if((nums[i]>=0 && i%2==0) && (nums[j]<0 && j%2!=0)){

        //     }
            
        // }
         // public void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }