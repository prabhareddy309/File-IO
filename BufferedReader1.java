import java.io.*;
class BufferedReader1
{
public static void main(String args[])
{
	
	try{
	
	
	
	PrintWriter pw=new PrintWriter("abc.txt");
	pw.println(100);
	pw.println(20.5);
	pw.println("prabha");
	pw.println('a');
	pw.close();

	BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
	System.out.println(br.read());  // just reads single character
	char[] ch=new char[5];
	System.out.println(br.read(ch));   // reads 10 chars
	System.out.println(br.readLine());
	}
	catch(Exception ex)
	{
		
	}


	
}
}
