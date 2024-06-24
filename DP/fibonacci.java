package DP;

import java.util.HashMap;
import java.util.Map;

public class fibonacci {
    // recursive approach
    // precalculation in DP (top down) is termed as "mermorization"
    static Map<Integer,Integer> memo = new HashMap<>();
    static int top_down(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = top_down(n-1)+top_down(n-2);
        memo.put(n, result);
        return result;
    }

    // iterative approach
    // precalculation in DP (bottom up) is termed as "tabulation"
    static int bottom_up(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int result[] = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for(int i=2; i<=n; i++){
            result[i] = result[i-1] + result[i-2];
        }

        return result[n];
    }
    public static void main(String[] args) {
        // System.out.println(bottom_up(7));
        System.out.println(top_down(7));
    }
}
