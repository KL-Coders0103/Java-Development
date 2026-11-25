package collectionFramework;

public class CircularQueue {
	
	int[] queue;
	int size,front,rear;
	
	public CircularQueue(int size) {
		this.size = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	//Inserting the element in the circular queue
	void enqueue(int data) {
		if((rear + 1) % size == front) {
			System.out.println("Queue is full");
			return;
		}
		
		if(front == -1) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % size;
		}
		
		queue[rear] = data;
		System.out.println(data+" Inserted");
	}
	
	// Removing the element from queue
	void dequeue() {
		if(front == -1) {
			System.out.println("Queue is already empty");
			return;
		}
		int value = queue[front];
		if(front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % size;
		}
		System.out.println(value+" Removed");
	}
	
	//printing the queue
	void display() {
		if(front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front; i<=rear; i=(i+1)%size) {
			System.out.println(queue[i]);
		}
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(15);
		cq.enqueue(20);
		cq.enqueue(25);
		cq.display();
		cq.dequeue();
		cq.display();

	}

}




// DRY Run

/* Method           front    rear    size    (rear + 1) % size     (rear + 1) % size == front      front == -1     queue[rear] = data         Operation      Value    front == rear    front = (front + 1) % size
 * 
 * object creation   -1      -1      5        (-1+1) % 5 = 0                  false                     -               -                         -
 * enqueue(15)        0       0      5        (0+1) % 5 = 1               	  False                    True             15                     inserted
 * enqueue(20)        0       1      5        (1+1) % 5 = 2                   False                    False            20                     inserted
 * enqueue(2%)        0       2      5        (2+1) % 5 = 3                   False                    False            25                     inserted
 * 
 * dequeue()          1       2      5                                                                 False                                   removed        15         False             (0+1) % 5 = 1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
