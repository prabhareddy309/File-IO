import java.io.File;
class FilePractice1
{
	public static void main(String args[])
	{
		File  f=new File("abc");
		System.out.println(f.exists());
		String s[]=f.list();
		for(String ss:s)
		{
			System.out.print(ss+" is ");
			File f1=new File(ss);
			if(f1.isFile())
			{
				System.out.println("File");
			}
			if(f1.isDirectory())
			{
				System.out.println("Directory");
			}
			
		}
	}
}
