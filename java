package Java;

public class constructor_1 {
	public static void main(String[] args)
	{
		constructor obj = new constructor("Sayantani" , "female",916322220);
		obj.displayinfo();
		
		constructor obj1 = new constructor("Mritunjay", "male", 852369555);
		obj1.displayinfo();
		
		constructor obj1 = new constructor("Sudeshna", "female", 859969555);
		obj1.displayinfo();
		
		constructor obj2 = new constructor();
		obj2.displayinfo();
	}

}
