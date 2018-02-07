class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        char[] ch = new char[n*2];
        DFS(list , ch , 0 , 0 , n);
        return list;
    }
    public void DFS(List<String> res , char[] ch , int l , int r , int n){
        if ( l < r )    
            return;
        if ( l > n || r > n )    
            return;
        if ( l == n && r == n ){
            res.add(String.valueOf(ch));
            return;
        }
        ch[l+r] = ')';
        DFS( res , ch , l   , r+1 , n);
        ch[l+r] = '(';
        DFS( res , ch , l+1 , r   , n);
        return;
    }
}
