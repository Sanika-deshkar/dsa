import java.util.*;
public class Main
{
    public static void bubble(int numbers[]){
        int swaps=0;
        for(int i=0;i<numbers.length-1;i++){   //loop for no of turns
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){  //if next element is greater, swap them
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swaps++;
                }
            }
        }
        System.out.println("No of swaps: "+swaps);
    }
    public static void printArr(int numbers[]){  //to print array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int numbers[]={5,4,1,2,3};
		bubble(numbers);
		printArr(numbers);
	}
}
