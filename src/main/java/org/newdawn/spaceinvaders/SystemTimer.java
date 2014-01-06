package org.newdawn.spaceinvaders;


/**
 * A wrapper class that provides timing methods. This class
 * provides us with a central location where we can add
 * our current timing implementation. Initially, we're going to
 * rely on the GAGE timer. (@see http://java.dnsalias.com)
 *
 * @author Kevin Glass
 */
public class SystemTimer {


    public static long getTime() {
        return System.nanoTime() / 1000000;
        //return System.currentTimeMillis();
    }

    /**
     * Sleep for a fixed number of milliseconds.
     *
     * @param duration The amount of time in milliseconds to sleep for
     */
    public static void sleep(long duration) {
//        timer.sleep((duration * timerTicksPerSecond) / 1000);
        try {
            Thread.sleep(duration);
        } catch (Exception e) {
        }
    }
}