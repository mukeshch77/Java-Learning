package StackClass;
public class StackUsingArray {
    int[] data;
    int top = -1;
    final static int DEFAULT_SIZE = 10;

    StackUsingArray() {
        this(DEFAULT_SIZE);
    }

    StackUsingArray(int size) {
        data = new int[size];
    }

    boolean isFull() {
        if (top == data.length - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    int push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!!");
            return -1;
        }
        top++;
        data[top] = item;
        return data[top];
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is already Empty!!!!");
            return -1;
        }
        int remove = data[top];
        data[top] = 0;
        top--;
        return remove;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty!!");
            return;
        }
        for (int k = top; k >= 0; k--) {
            System.out.println(" "+ data[k]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(9);
        stack.push(14);
        stack.push(10);
        stack.push(45);
        stack.push(67);
        stack.push(23);
        stack.pop();
        stack.pop();
        stack.display();
    }
}
