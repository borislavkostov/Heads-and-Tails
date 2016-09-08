import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HeadAndTails 
{
	public static void main(String args[])
	{
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Enter input : ");
		String input=keyboard.nextLine();
		List<String> H=new ArrayList<String>();
		List<String> T=new ArrayList<String>();
		char[] charInput=input.toCharArray();
		for (int i = 0; i < charInput.length; i++) 
		{
			if (charInput[i]=='T') 
			{
				T.add("T");
			}
			else if (charInput[i]=='H') 
			{
				H.add("H");
			}
		}
		if (T.size()>H.size()) 
		{
			System.out.println("T wins !");
		}
		else if (H.size()>T.size()) 
		{
			System.out.println("H wins !");
		}
		else
		{
			System.out.println("Draw !");
		}

	}
}
