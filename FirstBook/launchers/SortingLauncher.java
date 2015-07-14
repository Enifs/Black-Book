import java.util.ArrayList;

/**
 * Created by Enifs
 */
public class SortingLauncher extends Launcher
{
    // ----------------------------------------------------------------------------
    // Section: Constructors 
    // ----------------------------------------------------------------------------

    public SortingLauncher ()
    {
        super();
        this.listOfLists = new ArrayList<ArrayList>(10);
        for (int i = 0; i < 10; i++)
        {
            this.listOfLists.add(Utilities.randomIntegerList(10000, 0, 10000));
        }
    }

    // ----------------------------------------------------------------------------
    // Section: Getters and Setters 
    // ----------------------------------------------------------------------------

    public ArrayList<ArrayList> getListOfLists ()
    {
        return this.listOfLists;
    }

    // ----------------------------------------------------------------------------
    // Section: Other methods 
    // ----------------------------------------------------------------------------
    
    // ----------------------------------------------------------------------------
    // Section: Fields 
    // ----------------------------------------------------------------------------

    private ArrayList< ArrayList > listOfLists;
}
