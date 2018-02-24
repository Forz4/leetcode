class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int flag = 0;
        for ( int i = 0 ; i < s.length() ; i ++ ){
            char cur = s.charAt(i);
            if ( cur == ' ' ){
                flag = 1;
                continue;
            }else{
                if (flag == 1)  len = 1;
                else            len ++;
                flag = 0;
            }
        }
        return len;
    }
}
