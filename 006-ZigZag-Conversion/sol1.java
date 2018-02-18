class Solution {
    public String convert(String s, int numRows) {
        if ( numRows == 1 )
            return s;
        String[] str = new String[numRows];
        for (int i = 0 ; i < numRows ; i ++){
            str[i] = "";
        }
        String ret = "";
        int flag = 1;
        int j= 0;
        for (int i = 0 ; i < s.length() ; i ++){
            str[j] = str[j] + String.valueOf(s.charAt(i));
            j += flag;
            if ( j < 0 ){
                j = 1;
                flag = -flag;
            }
            if ( j == numRows ){
                j = numRows - 2;
                flag = -flag;
            }
        }
        for (int i = 0 ; i < numRows ; i ++){
            ret += str[i];
        }
        return ret;
    }
}
