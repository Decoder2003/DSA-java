package array;

public class minMax {
    int maxArray(int arr[]){
        int mx = -1;
        for(int i=0; i<arr.length; i++){
            mx = Math.max(arr[i],mx);
        }
        return mx;
    }

    int minArray(int arr[]){
        int mn = 10000;
        for(int i=0; i<arr.length; i++){
            mn = Math.min(arr[i],mn);
        }
        return mn;
    }
    public static void main(String[] args) {
        minMax obj = new minMax();
        int arr[] = {4,31,5,7,0,10,30,1,4,2};
        System.out.println("Min : "+obj.minArray(arr));
        System.out.println("Max : "+obj.maxArray(arr));
    }
}
