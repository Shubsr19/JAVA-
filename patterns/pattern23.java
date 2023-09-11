package patterns;

public class pattern23 {
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = rows; j >= i; j--)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
	}

}
