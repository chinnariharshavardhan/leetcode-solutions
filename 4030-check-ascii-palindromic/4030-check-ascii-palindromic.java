class Solution {
    public boolean isPalindromic(String s) {

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
           String binary = Integer.toBinaryString(s.charAt(i));

            binary = String.format("%8s", binary).replace(' ', '0');

            str.append(binary);
        }

        int st = 0;
        int end = str.length() - 1;

        while(st < end){
            if(str.charAt(st) != str.charAt(end)){
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}