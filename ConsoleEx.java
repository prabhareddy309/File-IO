import java.io.Console;
public class ConsoleEx
{
	public static void main(String args[])
	{
		Console cs=System.console();
		String s=cs.readLine();
		char pwd[]=cs.readPassword();
		String ss=new String(pwd);
		System.out.println("hello "+s);
		System.out.println("pwd "+ss);
	}
}
