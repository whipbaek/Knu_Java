package MidTerm_Exam;

public class Q2 {
    private static int front, rear, capacity;
    private static int queue[];

    public Q2(int c) {
        queue = new int[c];
        front = 0;
        rear = 0;
        capacity = c;
    }

    // function to insert an element
    // at the rear of the queue
    void queueEnqueue(int data) {
        if (rear > capacity-1) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear++] = data;

    }

    // function to delete an element
    // from the front of the queue
    void queueDequeue() {
        if (rear == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 1; i < rear; i++) {
            queue[i - 1] = queue[i];
        }
        rear--;
    }

    // print queue elements
    void queueDisplay() {
        if (rear == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i < rear; i++) {
            if(i == rear - 1)
                System.out.println(queue[i]);
            else
                System.out.print(queue[i] + " <-- ");
        }
    }

    // print front of queue
    void queueFront() {
        if (rear == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("The front element : " + queue[front]);

    }
}