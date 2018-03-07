class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if ( digits.length() == 0 )
            return list;
        char[][] phone = {   {},
                             {}, 
                             {'a','b','c'},
                             {'d','e','f'},
                             {'g','h','i'},
                             {'j','k','l'},
                             {'m','n','o'},
                             {'p','q','r','s'},
                             {'t','u','v'},
                             {'w','x','y','z'}
                         };
        dfs(phone , digits , list , new char[digits.length()] , 0);
        return list;
    }
    private void dfs(char[][] phone , String digits , List<String> list , char[] current , int index){
        if ( index == digits.length() ){
            list.add(String.valueOf(current));
            return;
        } else {
            char now = digits.charAt(index);
            int num = now - '0';
            for ( int i = 0 ; i < phone[num].length ; i ++){
                current[index] = phone[num][i];
                dfs(phone , digits , list , current , index + 1);
            }
        }
    }
}
