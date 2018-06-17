class Count
{
	int words=0,letters=0;
	void count(String s)
	{
		while(s!=null)
		{
			if(s==" ")
				continue;
			letters++;
		}
		System.out.println("The given string has "+letters+" letters");
		String[] wrd=s.split(" ");
		for(String word:wrd)
			while(word!=null)
				words++;
		System.out.println("The given string has "+words+" words");
	}
	public static void main(String args[])
	{
		Count c=new Count();
		c.count("I am a girl");
	}	
}