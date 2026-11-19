package collectionFramework;

public class TestLinkedList {

	public static void main(String[] args) {
		Node first = new Node(05);
		Node second = new Node(10);
		Node third = new Node(15);
		Node temp = first;
		first.next = second;
		second.next = third;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
