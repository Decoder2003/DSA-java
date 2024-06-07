package Recursion;

public class sumOfDigit {
    public static int fun(int n){
        if(n==0){
            return 0;
        }
        return fun(n/10) + n%10;
    }

    public static void main(String[] args){
        sumOfDigit obj = new sumOfDigit();
        System.out.print("Sum of Digit : ");
        System.out.println(fun(123456));
    }
}
