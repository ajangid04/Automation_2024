package Automation;

public class Task3 {
	
	/*three parameterized constructor
	default constructor
	one parameterized constructor
	two parameterized constructor
	four parameterized constructor*/
	
	public Task3()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public Task3(int a)
	{
		this();
		System.out.println("one parameterized constructor");
	}
	public Task3(int a, int b)
	{
		this(1);
		System.out.println("two parameterized constructor");
	}
	public Task3(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	public Task3(int a, int b, int c, int d)
	{
		this(1, 2);
		System.out.println("four parameterized constructor");
	}

	public static void main(String[] args)
	{
		Task3 ob = new Task3(1,2,3,4);
	}
}
