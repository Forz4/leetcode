class Solution {
    public String longestPalindrome(String s) {
        if ( s.length() == 0 || s.length() == 1 )
            return s;
        boolean[][] map = new boolean[s.length()][s.length()];
        int i;
        int j;
        int len;
        int res_x = 0;
        int res_y = 1;
        /*先获取长度为1的子串状态*/
        for ( i = 0 ; i < s.length() ; i ++)
            map[i][i] = true;
        /*先获取长度为2的子串状态*/
        for ( i = 0 ; i < s.length() - 1 ; i ++){
            if (s.charAt(i) == s.charAt(i+1)){
                map[i][i+1] = true;
                res_x = i;
                res_y = i+2;
            }else{
                map[i][i+1] = false;
            }
        }
        /*循环获取长度为3,4...的子串状态*/
        for ( len = 3 ; len <= s.length() ; len ++)
            for( i = 0 ; i + len - 1 < s.length() ; i ++){
                if ( ( map[i+1][i+len-2] ) && (s.charAt(i) == s.charAt(i+len-1)) ){
                    map[i][i+len-1] = true;
                    res_x = i;
                    res_y = i+len;
                }else{
                    map[i][i+len-1] = false;
                }
            }
        return s.substring(res_x,res_y);
    }
}
