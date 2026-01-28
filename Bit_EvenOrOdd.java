public class BitOddEven{
    public static void EvenOdd(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even 
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        EvenOdd(10);
        EvenOdd(1);
        EvenOdd(29);
    }
}
