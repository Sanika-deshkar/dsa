public class FirstOccurence{
    public static int firstocc(int[] arr, int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocc(arr,key,i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=5;
        System.out.println(firstocc(arr,key,0));
    }
}
