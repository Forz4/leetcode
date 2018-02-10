class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        DFS(list , "" , 0 , 0 , n);
        return list;
    }
    public void DFS(List<String> res , String str , int l , int r , int n){
        if ( l < r )    
            return;
        if ( l > n || r > n )    
            return;
        if ( l == n && r == n ){
            res.add(str);
            return;
        }
        DFS( res , str+")" , l   , r+1 , n);
        DFS( res , str+"(" , l+1 , r   , n);
        return;
    }
}
