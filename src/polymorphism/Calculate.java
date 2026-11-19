package polymorphism;

public class Calculate {
	
	void Add()
    {
        System.out.println("Addition: "+ (3+4));
    }
    void Add(int x,int y)  // change number of argument
    {
        System.out.println("Addition: "+ (x+y));
    }
    
    void Add(int x,float y)// change data type of argument
    {
        System.out.println("Addition: "+ (x+y));
    }
    
    void Add(float x,int y)  // change sequence of argument
    {
        System.out.println("Addition: "+ (x+y));
    }

}
