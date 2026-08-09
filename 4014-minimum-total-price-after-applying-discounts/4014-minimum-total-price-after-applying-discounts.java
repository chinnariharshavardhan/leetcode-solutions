class Solution {
    public double minPrice(int[] p, int[] d) {
        Arrays.sort(p);
        Arrays.sort(d);
        double min=0;
        int p1=p.length-1;
        int p2=d.length-1;
        while(p1>=0 && p2>=0){
            min+=p[p1]*(100.0-d[p2])/100;
            p1--;
            p2--;
        }
        while(p1>=0){
            min+=p[p1];
            p1--;
        }
        return min;
    }
}