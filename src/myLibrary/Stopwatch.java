package myLibrary;

/**
 * @author Joshua Tapp
 * This class is used to create stopwatch objects that can be used to record start and stop times with nanoTime.
 * Create the object and call the start() to begin stopwatch.
 * Use the end() method to stop the stopwatch.
 * To return the total elapsed time, use either elapsed() or toString() to return the value as a "long" or "String" respectively.
 */

public class Stopwatch{
   private long startTime;
   private long endTime;

    public Stopwatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    /**
     * All Methods are object specific.
     *
     * start() starts the timer at that point in nanoTime: returns long.
     * end() ends the timer at that point in nanoTime: returns long.
     * elapsed() calculates the time elapsed for this object: returns long.
     * toString() will return String with elapsed time in nanoTime, uses elapsed().
     */
    public void start(){ this.startTime = System.nanoTime(); }

    public void end() { this.endTime = System.nanoTime(); }

    public long elapsed() { return ( this.endTime - this.startTime ); }

    @Override
    public String toString() {
        double elapsedTimeInSecond = (double) elapsed() / 1_000_000_000;

        return String.format("%.10f", elapsedTimeInSecond);
    }


}
