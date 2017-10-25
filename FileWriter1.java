import java.io.*;
class FileWriter1
{
public static void main(String args[])
{
	
	try{
	FileWriter fw=new FileWriter("abc.txt");
	fw.write(100);
	fw.write("hello");
	fw.write('a');
	fw.flush();
	fw.close();
	}
	catch(Exception ex)
	{
		
	}
	
}
}
