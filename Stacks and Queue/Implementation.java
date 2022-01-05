import java.util.Scanner;

/**
 * Implementation
 */
public class Implementation {
    int stack[];
    int top;
    int size;

    public Implementation(int s) {
        size = s;
        top = -1;
        stack = new int[size];
    }

    public void push(int data) {
        stack[++top] = data;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean stackIsFull() {
        return size - 1 == top;
    }

    public boolean isEmpty() {

        return top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stackSize = sc.nextInt();
        Implementation st = new Implementation(stackSize);
        while (stackSize-- > 0) {
            st.push(sc.nextInt());
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
        sc.close();
    }
}