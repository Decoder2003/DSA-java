package Recursion;

public class treeRecursion {
    static void countDice(int curValue,int endValue,String result){
        // Base case
        if(curValue==endValue){
            System.out.print(result + ", ");
            return;
        }
        if(curValue > endValue){
            return;
        }
        // Recursive Case
        for(int i=1; i<=6; i++){
            curValue += i;
            // result += i;
            countDice(curValue,endValue,result+i);
            curValue -= i;
            // result -= i;
        }
    }
    public static void main(String[] args) {
        treeRecursion obj = new treeRecursion();
        countDice(0,20,"");
    }
}
