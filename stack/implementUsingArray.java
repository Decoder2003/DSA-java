package stack;

public class implementUsingArray {
    // Declaring the global variable
    int size;
    int stack[];
    int top;

    // constructor which creates a "stack" with length of "size"
    implementUsingArray(int size){
        this.size = size; // stack ka size equal to size given
        stack = new int[size]; // allocating stack of size
        this.top= -1; // This top is assign -1 as intially there are no elemets in stack
    }

    // add element at the top of the stack
    void push(int data){
        top++;
        stack[top] = data;
    }

    // check for the stack is empty or not? return true or false (underflow)
    boolean empty(){
        if(top==-1) return true;
        return false;
    }

    // Check whether the stack is full or not? return true or false (overflow)
    boolean full(){
        if(top==size-1) return true;
        return false;
    }

    // pop out the last element from the stack
    int pop(){
        return stack[top--];
    }

    // return the top element present at the stack
    int top(){
        return stack[top];
    }

    // dislpay the stack
    void show(){
        System.out.println("Dislpaying stack - ");
        for(int i=0; i<=top; i++){
            System.out.print(stack[i]+"->");
        }
    }
    public static void main(String[] args) {
        implementUsingArray stack = new implementUsingArray(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top : "+stack.top());
        stack.show();
        System.out.println("Pop : "+stack.pop());
        // System.out.println(stack.top());
        stack.show();
    }
}
