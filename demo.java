class demo//class declaration
{
	static
	{
		System.out.println("Inside Static Block");
	}
	demo()//initialise the object and create the object
	{
		System.out.println("Constructor");
	}
	public static void display()//method declaration
	{//method implementation
		System.out.println("Method/Instance/Non-static");
	}
	public static void main(String[] a)
	{
		System.out.println("Static method");
		new demo();//objection creation
		demo.display();
	}
}