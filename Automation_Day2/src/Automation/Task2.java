/*Assignment2
((((10/2)-2)-2)+2)*2)*/

package Automation;

public class Task2 {
	
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Value of Sum is " + c);
		return c;
	}
	public int Sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Value of Sub is " + c);
		return c;
	}
	public int Div(int a, int b)
	{
		int c=a/b;
		System.out.println("Value of Sub is " + c);
		return c;
	}
	public void Mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Value of Sum is " + c);
		
	}
	
	/*Assignment2
	((((10/2)-2)-2)+2)*2)*/
	
	public static void main(String[] args)
	{
		Task2 ob = new Task2();
		int a = ob.Div(10, 2);
		int b = ob.Sub(a, 2);
		int c = ob.Sub(b, 2);
		int d = ob.sum(c, 2);
		ob.Mul(d, 2);
	}
	

}
