bool isPalindrome(int x) {
    if ( x < 0 )         return false;
    if ( x / 10 == 0 )   return true;
    if ( x % 10 == 0 )   return false;
    int temp = 0;
    while(1){
        temp = temp * 10 + x % 10;
        if (temp > x) break;
        x /= 10;
        if ( temp == x || temp == (x/10) )
            return true;
    }
    return false;
}
