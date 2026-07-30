class Solution {
    public long coloredCells(int n) {
     long j=1;
     int diff=4;
     while(--n>0){
        j+=diff;
        diff+=4;
     }
     return j;
    }
}