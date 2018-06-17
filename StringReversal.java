interface ReverseString
{
	String reversal(String s);
}
class StringReversal implements ReverseString
{
	int l,i;
	public String reversal(String s)
	{
		System.out.println("The given string is "+s);
		l=s.length();
		System.out.println();
		for(i=l-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));                             
		}
		return s;	
	}
	public static void main(String args[])
	{
		StringReversal s1=new StringReversal();
		s1.reversal("APPLE");
	}
}