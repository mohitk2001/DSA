import java.util.Scanner;

class Queue {
    int capacity;
    int a[];
    int rear;

    public Queue(int n) {
        a = new int[n];
        rear = -1;
        capacity = n;
    }

    public void enqueue(int data) {
        if (capacity - 1 == rear) {
            System.out.println("It is full");
            return;
        }
        rear++;
        a[rear] = data;
    }

    public int dequeue() {
        if (rear == -1) {
            return -1;
        }
        int res = a[0];
        for (int i = 0; i < rear; i++) {
            a[i] = a[i + 1];
        }
        rear--;
        return res;
    }

    public int getFront() {
        if (rear == -1) {
            return -1;
        }
        return a[0];
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue queue = new Queue(size);
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        //queue.enqueue(sc.nextInt());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        sc.close();
    }
}
