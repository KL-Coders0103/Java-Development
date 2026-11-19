package collectionFramework;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		NodeForDoubleLinkedList first = new NodeForDoubleLinkedList(05);
		NodeForDoubleLinkedList second = new NodeForDoubleLinkedList(10);
		NodeForDoubleLinkedList third = new NodeForDoubleLinkedList(15);
		
		first.next = second;
		second.prev = first;
		second.next = third;
		third.prev = second;
		
		//Forward Traversing
		NodeForDoubleLinkedList temp = first;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		//Backward Traversing
		System.out.println("Backward Traversing");
		temp = third;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		
	}

}
