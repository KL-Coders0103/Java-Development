package innerClasses;

//public class Car {
//	private String name = "BMW";
//	
//	void drive() {
//		System.out.println("Drive car");
//	}
//	
//	// Member inner class
//	
//	class Engine {
//		void start() {
//			System.out.println(name+ " engine started");
//		}
//	}
//}


public class Car {
	private String name = "BMW";
	
	void drive() {
		
		// Local inner class
		class Engine {
			
			void start() {
				System.out.println(name+ " engine started");
			}
		}
		
		Engine e = new Engine();
		e.start();
		System.out.println("Drive car");
	}
}
