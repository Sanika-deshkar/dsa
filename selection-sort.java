import java.util.*;
public class Main
{
    public static void selection(int numbers[]){  //turns
        for(int i=0;i<numbers.length-1;i++){
            int minPos=i;                         //min position is the current position(i)
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minPos]>numbers[j]){
                    minPos=j;
                }
            }
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
        }
    }
    public static void printArr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        } 
        System.out.println();
    }
	public static void main(String[] args) {
		int numbers[]={5,4,1,2,3};
		selection(numbers);
		printArr(numbers);
	}
}
