int strStr(char* haystack, char* needle) {
    int i = 0;
    int j = 0;
    int cur = 0;
    int len_haystack = strlen(haystack);
    int len_needle = strlen(needle);
    if ( len_haystack == 0 && len_needle == 0 )
        return 0;
    for ( i = 0 ; i < len_haystack ; i ++){
        cur = i;
        j = 0;
        while(haystack[cur] == needle[j] && j < len_needle){
            cur ++;
            j ++;
        }
        if ( j == len_needle )
            return i;
    }
    return -1;
}
