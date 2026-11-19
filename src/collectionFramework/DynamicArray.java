package collectionFramework;

public class DynamicArray {
	int[] arr;
	int size, capacity;
	
	public DynamicArray() {
		capacity = 2;
		size = 0;
		arr = new int[capacity];
	}
	
	void add(int data) {
		if(size == capacity) grow();
		arr[size] = data;
		size++;
	}
	
	void grow() {
		capacity = capacity * 2;
		int[] newArray = new int[capacity];
		for(int  i=0; i < size; i++) {
			newArray[i] = arr[i];
		}
		arr = newArray;
	}
	
	void display() {
		for(int i=0; i < size; i++) {
			System.out.println(arr[i]+" ");;
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = new int[3];
//		arr[0] = 33;
//		arr[1] = 88;
//		arr[2] = 99;
		
//		Dynamic aray is data structure that can automatically grow its 
//		capacity when more elements need to add
		DynamicArray d1 = new DynamicArray();
		d1.add(22);
		d1.add(33);
		d1.add(44);
//		d1.add(55);
//		d1.add(66);
		
		d1.display();
		System.out.println("----------------");
		System.out.println(d1.size);
		System.out.println(d1.capacity);
	}

}
