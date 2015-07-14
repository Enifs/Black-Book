/**
 * Created by Enifs.
 */

import java.util.LinkedList;

public class PerformanceStats extends LinkedList
{
	public double getAverage()
	{
		double sum = 0;
		for (Object o : this)
		{
			Double d = Double.parseDouble(o.toString());
			sum = sum + d;
		}

		return sum / this.size();
	}
}
