package Recursion;

public class countDigit {
    public static int fun(int n){
        if(n==0){
            return 0;
        }
        return fun(n/10) + i;
    }

    public static void main(String[] args){
        countDigit obj = new countDigit();
        System.out.print("Count : ");
        System.out.println(fun(123456));
    }
}
