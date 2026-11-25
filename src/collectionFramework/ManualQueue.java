package collectionFramework;

public class ManualQueue {

	int[] arr = new int[5];
	int front =0, rear=-1, size=0;
	
	//Insert the element in queue
	void enqueue(int value) {
		if(size == arr.length) {
			System.out.println("Queue is full");
			return;
		}
		
		rear++;
		arr[rear] = value;
		size++;
	}
	
	//Remove the element from queue
	int dequeue() {
		if(size == 0) {
			System.out.println("Queue is already empty");
			return -1;
		}
		
		int value = arr[front];
		front++;
		size--;
		return value;
	}
	
	//Print the queue
	void display() {
		if(size == 0) System.out.println("Queue is empty");
		for(int i=front; i<=rear; i++) System.out.println(arr[i]);
	}
	
	
	public static void main(String[] args) {
		ManualQueue que = new ManualQueue();
		que.enqueue(15);
		que.enqueue(20);
		que.enqueue(25);
		que.display();
		System.out.println("Removed: "+que.dequeue());
		que.display();
		System.out.println("Removed: "+que.dequeue());
		que.display();
		System.out.println("Removed: "+que.dequeue());
		que.display();
	}

}
