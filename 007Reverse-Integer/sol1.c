int reverse(int x) {
    int ret = 0;
    int temp = 0;
    while (x != 0 ){
        temp = ret*10 + x%10;
        if (( temp - x%10)/10 != ret)   return 0;
        ret = temp;
        x /= 10;
    }
    return temp;
}
