import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Enifs
 */
public class Utilities
{
    /**
     * This method creates list of random integers.
     * @param size Size of the desired list.
     * @param min Least possible value of integers in the list.
     * @param max Greatest possible value of integers in the list.
     * @return List of random integers.
     * @throws AssertionError Throws if size is not positive or range turns out negative.
     */
    public static ArrayList<Integer> randomIntegerList (int size, int min, int max) throws AssertionError
    {
        assert size > 0 : "size must be non-negative!";

        ArrayList<Integer> returnList = new ArrayList<Integer>(size);

        int difference = max - min + 1;
        assert difference > 0 : "Max must be greater than min!";

        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < size ; i++)
        {
            int x = random.nextInt(difference);
            returnList.add(i, x + min);
        }

        return returnList;
    }


    /**
     * This method tells if a list is sorted in ascending order.
     *
     *
     * @param list List to validate.
     * @return True if list is ordered, false otherwise.
     */
    public static boolean validateAscendingList(ArrayList list)
    {
        boolean returnValue = true;

        for (int i = 0; i < list.size() - 1; i++)
        {
            Comparable c1 = (Comparable) list.get(i);

            if (c1.compareTo(list.get(i + 1)) > 0)
            {
                returnValue = false;
            }
        }

        return returnValue;
    }


	/**
	 * This method clones an ArrayList<Integer>.
	 * @param list List to clone.
	 * @return A new instance of ArrayList with same content as list.
	 */
	public static ArrayList<Integer> cloneArrayList(ArrayList<Integer> list)
	{
		ArrayList<Integer> returnList = new ArrayList<Integer>(list.size());

		for (int i = 0; i < list.size(); i++)
		{
			returnList.add(list.get(i));

		}

		return returnList;
	}
}
