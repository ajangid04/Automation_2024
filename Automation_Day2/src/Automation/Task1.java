/*Assignment1
((((10+2)+2)-2)*2)/2) */

package Automation;

public class Task1 {
	
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
	public void Div(int a, int b)
	{
		int c=a/b;
		System.out.println("Value of Sub is " + c);
		
	}
	public int Mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Value of Sum is " + c);
		return c;
	}
	
	public static void main(String[] args)
	{
		Task1 ob = new Task1();
	    int x = ob.sum(10, 2);
	    int y = ob.sum(x, 2);
	    int yt = ob.Sub(y,2);
	    int yx = ob.Mul(yt, 2);
	    ob.Div(yx, 2);
	    
	    
	}

}
