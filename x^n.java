public class ToPower{
    public static int pow(int base,int exp){
        //method 1: O(n)
        // if(exp==0){
        //     return 1;
        // }
        // if(exp==1){
        //     return base;
        // }
        // return base*pow(base,exp-1);

        //method 2: O(logn)
        if(exp==0){
            return 1;
        }
        int halfPower=pow(base,exp/2);
        int halfPowerSquare=halfPower*halfPower;
       if(exp%2!=0){
        return halfPowerSquare*base;
       }
         return halfPowerSquare;
    }
    public static void main(String[] args) {
        int base=2;
        int exp=5;
        System.out.println(pow(base,exp));
    }
}
