import java.util.ArrayList;

/**
 * Created by Enifs
 */
public class BubbleSortProgram extends SortingLauncher
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
        Launcher launcher = new BubbleSortProgram();
        launcher.run();
    }

    public void run()
    {
        for (ArrayList numbers : this.getListOfLists())
        {
            this.getTimer().reset();

            BubbleSort bubbleSort = new BubbleSort(numbers);
            //JurisBubbleSort bubbleSort = new JurisBubbleSort(numbers);

            this.getTimer().start();
            bubbleSort.execute();
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
