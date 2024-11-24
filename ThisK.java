class Example
{
	int x,y;
	
	void f1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

};

class Example1 extends Example
{
	int x,y;
	void f3(int x,int y)
	{
		super.x=x;
		super.y=y;
	}

	void f4()
	{
		System.out.println(super.x);
		System.out.println(this.y);
	}
}


class ThisK
{
	public static void main(String []args)
	{
		Example1 e1=new Example1();
		e1.f3(5,6);
		e1.f4();

	}
}