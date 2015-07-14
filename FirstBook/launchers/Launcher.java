/**
 * Created by Enifs
 */
public class Launcher
{
    // ----------------------------------------------------------------------------
    // Section: Constructors 
    // ----------------------------------------------------------------------------

    public Launcher ()
    {
        this.timer = new PerformanceTimer();
        this.stats = new PerformanceStats();
    }


    // ----------------------------------------------------------------------------
    // Section: Getters and Setters 
    // ----------------------------------------------------------------------------

    public PerformanceStats getStats ()
    {
        return stats;
    }

    public PerformanceTimer getTimer ()
    {
        return timer;
    }

    // ----------------------------------------------------------------------------
    // Section: Other methods 
    // ----------------------------------------------------------------------------

    public void run ()
    {

    }
    // ----------------------------------------------------------------------------
    // Section: Fields 
    // ----------------------------------------------------------------------------

    private PerformanceTimer timer;

    private PerformanceStats stats;
}
