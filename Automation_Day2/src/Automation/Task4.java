package Automation;

public class Task4 {
	
	/*three parameterized method
default method
one parameterized method
two parameterized method
four parameterized method
*/
	
	public void m()
	{
		System.out.println("Default Method");
	}
	public void m1(int a)
	{
		System.out.println("one parameterized method");
	}
	public void m2(int a, int b)
	{
		System.out.println("two parameterized method");
	}
	public void m3(int a, int b, int c)
	{
		System.out.println("three parameterized method");
		this.m();
		this.m1(1);
		this.m2(1, 2);
		this.m4(1, 2, 3,4);
	}
	public void m4(int a, int b, int c, int d)
	{
		System.out.println("four parameterized method");
	}
	
	public static void main(String[] args)
	{
		Task4 mt = new Task4();
		mt.m3(1, 2, 3);
	}

}
