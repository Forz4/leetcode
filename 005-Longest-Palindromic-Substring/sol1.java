class Solution {
    public String longestPalindrome(String s) {
        if ( s.length() == 0 || s.length() == 1 ){
            return s;
        }
        int x;
        int y;
        int max = 0;
        int res_x = 0;
        int res_y = 0;
        for ( int i = 0 ; i < 2*s.length()-1 ;  i ++){
            if ( i % 2 == 0 ){
                x = i/2 - 1;
                y = i/2 + 1;
            }else{
                x = (i-1) / 2;
                y = (i+1) / 2;
            }
            while( x>=0 && y<s.length() && s.charAt(x) == s.charAt(y) ){
                x --;
                y ++;
            }
            if (y - x - 1 > max){
                max = y - x - 1;
                res_x = x + 1;
                res_y = y;
            }
        }
        return new String(s.substring(res_x,res_y));
    }
}
