import java.util.ArrayList;

/**
 * Created by Enifs
 */
public class SelectionSortProgram extends SortingLauncher
{
    // ----------------------------------------------------------------------------
    // Section: Constructors 
    // ----------------------------------------------------------------------------
    
    // ----------------------------------------------------------------------------
    // Section: Getters and Setters 
    // ----------------------------------------------------------------------------
    
    // ----------------------------------------------------------------------------
    // Section: Other methods 
    // ----------------------------------------------------------------------------

    public static void main (String[] args)
    {
        Launcher launcher = new SelectionSortProgram();
        launcher.run();
    }

    public void run()
    {
        for (ArrayList numbers : this.getListOfLists())
        {
            this.getTimer().reset();

            Algorithm algorithm = new SelectionSort();

            this.getTimer().start();
            algorithm.execute();
            this.getTimer().stop();

            this.getStats().add(this.getTimer().result());

            if (!Utilities.validateAscendingList(numbers))
            {
                System.out.println("List not sorted!");
            }
        }

        System.out.println(this.getStats().getAverage());
    }
    // ----------------------------------------------------------------------------
    // Section: Fields 
    // ----------------------------------------------------------------------------

}
