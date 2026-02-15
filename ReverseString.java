class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
    public static void rev(char[] s, int l, int r){
        if(l>=r){
            return;
        }
        char t = s[l];
        s[l]=s[r];
        s[r]=t;

        rev(s,l+1,r-1);
    }
}
