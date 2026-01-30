public class BitManipulation{
    public static int getbit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setbit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearbit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updatebit(int n, int i,int newBit){
        if(newBit==0){
            return clearbit(n, i);
        }
        else{
            return setbit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println((int)getbit(10,3));
        System.out.println((int)setbit(10, 2));
        System.out.println((int)clearbit(10, 1));
        System.out.println((int)updatebit(10, 1, 2));

    }
}
