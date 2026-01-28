public class BitManipulation{
    public static int getbit(int n,int i){
        int bitMask = 1<<i; //left shift
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
        int bitMask = ~(1<<i); //NOT of leftshift
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println((int)getbit(10,3));
        System.out.println((int)setbit(10, 2));
        System.out.println((int)clearbit(10, 1));

    }
}
