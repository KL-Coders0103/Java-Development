package aggregation_association_composition;

public class House {
	private Room room;
	
	//composition:- container object is created while creating the new object of the contained object
	public House() {
		room = new Room();
	}
	
	void show() {
		System.out.println("House exists");
		room.display();
	}
}
