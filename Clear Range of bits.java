public class ClearRange {

    public static int Clear_iBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        int n = 29;
        int i = 1, j = 3;
        System.out.println(Clear_iBits(n, i, j)); // 17
    }
}
