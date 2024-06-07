package array;

public class rotateArray {

    public static void Rotate(int arr[],int k){
        int n = arr.length; // length arr[] ki
        int[] temp = new int[n]; // abh ekk nai array banayi 'n' size ki

        // arr = [1,2,3,4,5,6,7]
        //        0 1 2 3 4 5 6 

        // output = [4,5,6,7,1,2,3]
        //           0 1 2 3 4 5 6

        // abh arr[] and output[] ke index match karo
        // 0 index ki value -> 4 index pe  (7-3+0)%7 = 4
        // 1->5 (7-3+1)%7 = 5
        // 2->6 (7-3+2)%7 = 6
        // 3->0 (7-3+3)%7 = 0
        // 4->1 (7-3+4)%7 = 1
        // 5->2 (7-3+5)%7 = 2
        // 6->3 (7-3+6)%7 = 3

        // bss is pattern ko solve karna hai, bracket mai dekho ek general formula use kia hai
        // general formula : (n-k+i)%n
        // where : n = 7 , k = 3

        for(int i=0; i<n; i++){
            temp[(n-k+i)%n] = arr[i];
        }

        // copying temp[] into arr[]
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate(arr,k);

        // Display
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
