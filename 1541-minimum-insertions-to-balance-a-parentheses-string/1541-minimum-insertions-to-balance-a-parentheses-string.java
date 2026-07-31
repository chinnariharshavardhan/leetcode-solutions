class Solution {
    public int minInsertions(String s) {
        int added=0;
        int right=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(right%2>0){
                    right--;
                    added++;
                }
                right+=2;
            }else{
                right--;
                if(right<0){
                    right+=2;
                    added++;
                }
            }
        }
        return right+added;
    }
}