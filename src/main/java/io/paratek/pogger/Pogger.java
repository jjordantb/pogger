package io.paratek.pogger;

import sun.reflect.Reflection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Main logging class
 */
public class Pogger {

    public void log(final Level level, final String message) {
        final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        final String date = dateFormat.format(new Date());
        final String callingClass = Thread.currentThread().getStackTrace()[3].getClassName();
        final String callingMethod = Thread.currentThread().getStackTrace()[3].getMethodName();
        System.out.println(callingClass + "." + callingMethod + " " + date);
        System.out.println("    [" + level.name() + "]: " + message);
    }

    public void atInfo(final String message) {
        this.log(Level.INFO, message);
    }

    public void atFine(final String message) {
        this.log(Level.FINE, message);
    }

    public void atDebug(final String message) {
        this.log(Level.DEBUG, message);
    }

    public void atWarning(final String message) {
        this.log(Level.WARNING, message);
    }

    public void atError(final String message) {
        this.log(Level.ERROR, message);
    }

    public void atSevere(final String message) {
        this.log(Level.SEVERE, message);
    }

    public void info(final String message) {
        this.log(Level.INFO, message);
    }

    public void fine(final String message) {
        this.log(Level.FINE, message);
    }

    public void debug(final String message) {
        this.log(Level.DEBUG, message);
    }

    public void warning(final String message) {
        this.log(Level.WARNING, message);
    }

    public void error(final String message) {
        this.log(Level.ERROR, message);
    }

    public void severe(final String message) {
        this.log(Level.SEVERE, message);
    }

    /**
     * Logging levels, only the important ones.
     */
    public enum Level {

        FINE,
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        SEVERE

    }

}
