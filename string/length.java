package string;

public class length {
    int len(String[] str,int ){
        // base condition
        if(str[i]=="\0"){
            return;
        }
        // recursive function
        return len(str,i-1)+1;
    }
    public static void main(String[] args) {
        
    }
}
