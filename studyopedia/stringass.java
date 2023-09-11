package studyopedia;

public class stringass
	{
	public static int vowelCount(String str)
	{
	int c=0;
	char a[]=str.toCharArray();
	for(int i=0;i<a.length;i++)
	{
	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
	{
	c++;
	}
	}
	System.out.println("vowel= "+c);
	return(c);
	}
	public static void main(String s[])
	{
	vowelCount(new String("i am tarun Chhoker"));
	}

	}


