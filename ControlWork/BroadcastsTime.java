package ControlWork;


import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class BroadcastsTime implements Comparable {
    private String timeString;
    private LocalTime time = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm"));

    public BroadcastsTime(String timeString) {
        this.timeString = timeString;
    }
    byte hour() {
        return (byte) (time.getHour());
    }
    byte minutes() {
        return (byte) (time.getMinute());
    }
    public int compareTo(BroadcastsTime o) {
        if (this.hour() > 24 || this.hour() < 0 || o.hour() < 0 || o.hour() > 24) {
            throw new DateTimeException("0 <= hour <=24");
        }
        if (this.hour() > o.hour()) {
            return 1;
        }
        if (this.hour() < o.hour()) {
            return -1;
        }
        if (this.hour() == o.hour()) {
            if (this.minutes() > o.minutes()) {
                return 1;
            }
            if (this.minutes() < o.minutes()) {
                return -1;
            }
            if (this.minutes() == o.minutes()) {
                return 0;
            }
        }
        return 0;
    }

    boolean after(BroadcastsTime t){
        if (this.compareTo(t) > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean befor(BroadcastsTime t){
        if (this.compareTo(t) < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean between(BroadcastsTime t1, BroadcastsTime t2) {
        if (this.compareTo(t1) > 0 & this.compareTo(t2) < 0) {
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}