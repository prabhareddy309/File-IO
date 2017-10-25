import java.io.File;
class FilePractice
{
	public static void main(String args[])
	{
		File f=new File("abc.txt");   //type 1 constructor
		System.out.println(f.exists());
		try{
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.isFile());
		}
		catch(Exception ex)
		{
		}

		File f1=new File("abc");
		System.out.println(f1.exists());
		try{
		f1.mkdir();
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		}
		catch(Exception ex)
		{
		}

		File f2=new File(f1,"abcd.txt");  //type 2 constructor
		try{
		f2.createNewFile();
		}
		catch(Exception ex)
		{
		}
		
		File f3=new File("abc","abcd"); //type 3 constructor
		try{
		f3.mkdir();
		}
		catch(Exception ex)
		{
		}
		
	}
}
