import java.util.ArrayList;

/**
 * Created by Enifs
 */

/**
 * This class sorts a given ArrayList of Integers in ascending order.
 */
public class BubbleSort implements Algorithm
{
	// ----------------------------------------------------------------------------
	// Section: Constructors
	// ----------------------------------------------------------------------------


	/**
	 * Default constructor.
	 *
	 * @param list A list to be sorted.
	 */
	public BubbleSort(ArrayList list)
	{
		this.list = list;
	}

	// ----------------------------------------------------------------------------
	// Section: Getters
	// ----------------------------------------------------------------------------


	public ArrayList getList()
	{
		return this.list;
	}

	// ----------------------------------------------------------------------------
	// Section: Execution
	// ----------------------------------------------------------------------------


	/**
	 * This method sorts a given ArrayList<Integer> in an ascending order using a
	 * bubbleSort technique.
	 */
	@Override
	public void execute()
	{
		ArrayList<Comparable> list = this.getList();

		int listSize = list.size();
		for (int i = 0; i < listSize; i++)
		{
			for (int j = 0; j < listSize - i - 1; j++)
			{
				if (list.get(j).compareTo(list.get(j + 1)) > 0)
				{
					Object temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, (Comparable) temp);
				}
			}
		}
	}

	// ----------------------------------------------------------------------------
	// Section: Fields
	// ----------------------------------------------------------------------------

	private ArrayList list;
}
