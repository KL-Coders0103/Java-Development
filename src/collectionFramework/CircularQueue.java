package collectionFramework;

public class CircularQueue {
    int[] queue;
    int size, front, rear;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Inserting the element in the circular queue
    void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        queue[rear] = data;
        System.out.println(data + " Inserted");
    }

    // Removing the element from queue
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is already empty");
            return;
        }
        int value = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println(value + " Removed");
    }

    // Printing the queue 
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.println(queue[i]);
            if (i == rear) break;
            i = (i + 1) % size;
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(15);
        cq.enqueue(20);
        cq.enqueue(25);
        cq.enqueue(30);
        cq.enqueue(35);
        cq.enqueue(40);
        cq.display();
        cq.dequeue();
        cq.display();
    }
}

/*
 * DRY RUN (size = 5)
 * -------------------------------------------------------------------------------------------------------------
 * Method          | front | rear | (rear+1)%size == front | front == -1 | Operation / Output
 * -------------------------------------------------------------------------------------------------------------
 * Object creation |  -1   |  -1  |          -             |      -      | Queue created of size 5
 * enqueue(15)     |   0   |   0  |         false          |    true     | queue[0] = 15 -> "15 Inserted"
 * enqueue(20)     |   0   |   1  |         false          |    false    | queue[1] = 20 -> "20 Inserted"
 * enqueue(25)     |   0   |   2  |         false          |    false    | queue[2] = 25 -> "25 Inserted"
 * enqueue(30)     |   0   |   3  |         false          |    false    | queue[3] = 30 -> "30 Inserted"
 * enqueue(35)     |   0   |   4  |         false          |    false    | queue[4] = 35 -> "35 Inserted"
 * enqueue(40)     |   0   |   4  |         true           |      -      | "Queue is full"
 * display()       |   0   |   4  |           -            |    false    | Prints: 15, 20, 25, 30, 35
 * dequeue()       |   1   |   4  |           -            |    false    | front = (0+1)%5 -> "15 Removed"
 * display()       |   1   |   4  |           -            |    false    | Prints: 20, 25, 30, 35
 * -------------------------------------------------------------------------------------------------------------
 */
