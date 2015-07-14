//
// Created by Enifs.
//

import java.util.ArrayList;

public class JurisBubbleSort extends BubbleSort
{

	/**
	 * Default constructor.
	 *
	 * @param list A list to be sorted.
	 */
	public JurisBubbleSort(ArrayList<Integer> list)
	{
		super(list);
	}


	@Override
	public void execute()
	{
		ArrayList<Integer> list = this.getList();

		for (int i = 0; i < list.size(); i++)
		{
			for (int r = 0; r < list.size() - 1 - i; r++)
			{
				if (list.get(r) > list.get(r + 1))
				{
					int temp = list.get(r);

					list.set(r, list.get(r + 1));

					list.set(r + 1, temp);
				}
				//System.out.println(list.get(r));
			}

		}
	}
}
