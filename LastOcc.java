public class LastOcc{
    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1  && arr[i] == key){ //check with lastOccurence
            return i;
        }
        return isFound;
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int key = 5;
    System.out.println(lastOccurence(arr, key, 0));
}
}
