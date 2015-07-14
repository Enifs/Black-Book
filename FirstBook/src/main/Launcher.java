

package main;


import java.util.ArrayList;
import java.util.List;


public class Launcher
{
	public static void main(String[] args)
	{
		new Launcher().run();
	}


	private void run()
	{
		List<Integer> list = new ArrayList<Integer>();


		int f = 0;
		for (int i = 0; i < 150; i++)
		{
			if (i<50 || i>100)
			{
				f = f + i;
			}
		}

		System.out.println(f);

	}
}
