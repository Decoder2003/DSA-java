public class Main {
    public static int fun(int n, int count){
        if(n==0){
            return count;
        }
        n = n/10;
        return fun(n,++count);
    }

    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(fun(7458,0));
        // int n = 7458;
        // int count = 0;
        // while(n>0){
        //     count++;
        //     n = n/10;
        // }
    }
}