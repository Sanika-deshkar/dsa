import java.util.*;
public class Main
{
    public static int largestVal(int numbers[]){
        int largest=Integer.MIN_VALUE;  //assings largest value to -infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];  //if number is greater than largest,swap
            }
        }
        return largest;
    }
    public static int smallestVal(int numbers[]){
        int smallest=Integer.MAX_VALUE;  //assings largest value to +infinity
        for(int i=0 ;i<numbers.length ;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];  //if number is smaller than smallest,swap
            }
    }
    return smallest;
    }
	public static void main(String[] args) {
	int numbers[]={1,2,6,5,13};
	System.out.println("Largest value is :" + largestVal(numbers));
	System.out.println("Smallest value is :" + smallestVal(numbers));
	}
}
