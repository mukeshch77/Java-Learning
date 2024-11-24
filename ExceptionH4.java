import java.io.*;
class ExceptionH4
{
	public static void main(String []args)
	{
		System.out.println("Hello");
		try
		{
			throw new IOException("Printer not found");
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}