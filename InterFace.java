interface i1
{
	int x=6;
	void f1();
	static void f2()
	{
		System.out.println(x);
	}
}

interface i2 extends i1
{
	int x=7;
	int y=2;
	static void f2()
	{
		System.out.println(x);
	}

	void f3();
}

class c1 implements i2
{
	public void f1()
	{

	}

	public void f3()
	{

	}

	static void f2()
	{
		System.out.println(x);
	}
}

class InterFace
{
	public static void main(String []args)
	{
		i2.f2();
		//c1 C1=new c1();
		//c1.f2();
		//System.out.println(C1.y);

		//i1.f2();
	}
}