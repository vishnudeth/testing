package Test;

public class TestClass {
	
	static TestClass t1 = new TestClass();  //Creating an object to call a non static method
	static TestClass2 t2 = new TestClass2(); // Creating Object for a different Class to call the method
	
	public static void main(String[] args) {
		
		System.out.println("Hello Welcome to my new Java Project"); 
		rafa();
		t1.djoker();
		t1.federer();
		TestClass2.delpo();
		t2.sacha();
		
	}
	
	public static void rafa() {
		System.out.println("Rafa lost in Monte Carlo");
	}

	public void djoker()  //Non static method called djoker
	{
		System.out.println("Djoker never won against Rafa on Clay");
	}
	
	public void federer() // Non static method called federer
	{
		System.out.println("Federer is a legend");
	}
}
