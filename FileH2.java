import java.io.*;

class FileH2
{
	public static void main(String []args) throws IOException
	{
		String s1="Hi, Mukesh Choudhary how are you?";

		FileOutputStream f1=new FileOutputStream("a.txt", true);

		int i;
		char c1[]=s1.toCharArray();
		for(i=0; i<c1.length; i++)
		{
			f1.write(c1[i]);
		}

		f1.close();
	}
}