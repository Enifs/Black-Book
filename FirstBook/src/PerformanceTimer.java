/**
 * Created by Enifs
 */

/**
 * Timer for measuring performance of algorithms or processes.
 */
public class PerformanceTimer
{
    // ----------------------------------------------------------------------------
    // Section: Constructors 
    // ----------------------------------------------------------------------------
    public PerformanceTimer()
    {
        this.startTime = 0;
        this.endTime = 0;
        this.terminated = false;
    }

    // ----------------------------------------------------------------------------
    // Section: Getters and Setters 
    // ----------------------------------------------------------------------------

    public long getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (long startTime)
    {
        this.startTime = startTime;
    }

    public long getEndTime ()
    {
        return endTime;
    }

    public void setEndTime (long endTime)
    {
        this.endTime = endTime;
    }

    public boolean isTerminated ()
    {
        return terminated;
    }

    public void setTerminated (boolean terminated)
    {
        this.terminated = terminated;
    }


    // ----------------------------------------------------------------------------
    // Section: Main functions
    // ----------------------------------------------------------------------------

    /**
     * This method starts the timer.
     */
    public void start()
    {
        if (!this.isTerminated())
        {
            this.setStartTime(System.currentTimeMillis());
        }
        else
        {
            System.out.println("Timer already has been stopped!");
            System.out.println("Reset timer to use it again!");
        }
    }

    /**
     * This method stops the timer.
     */
    public void stop()
    {
        this.setEndTime(System.currentTimeMillis() - this.startTime);
        this.setTerminated(true);
    }

    /**
     * This method returns current measurement.
     * Taking to many snapshots may cause inaccurate results.
     */
    public long takeSnapshot()
    {
        return System.currentTimeMillis() - this.startTime;
    }

    /**
     * This method resets timer to initial state.
     */
    public void reset()
    {
        this.setStartTime(0);
        this.setTerminated(false);
        this.setEndTime(0);
    }

    /**
     * This method return result.
     * @return Taken measurement in milliseconds.
     */
    public long result()
    {
        return this.endTime;
    }

    /**
     * This method return result.
     * @return Taken measurement in seconds.
     */
    public double resultInSeconds()
    {
        return this.endTime / 1000.0;
    }


    // ----------------------------------------------------------------------------
    // Section: Fields 
    // ----------------------------------------------------------------------------

    private long startTime;

    private long endTime;

    private boolean terminated;
}
