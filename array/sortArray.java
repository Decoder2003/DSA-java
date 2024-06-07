package array;

public class sortArray {
    void sort(int arr[]){
        for(int step = 0; step<arr.length; step++){
            for(int i=0; i<arr.length-step-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,31,5,7,0,10,30,1,4};
        sortArray obj = new sortArray();
        obj.sort(arr);

        //Display
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
