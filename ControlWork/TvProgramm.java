package ControlWork;

public class TvProgramm {
    private final String nameOfChanel;
    private final BroadcastsTime time;
    private final String nameOfProgramm;

    public TvProgramm(String nameOfChanel, BroadcastsTime time, String nameOfProgramm) {
        this.nameOfChanel = nameOfChanel;
        this.time = time;
        this.nameOfProgramm = nameOfProgramm;
    }

    public String getNameOfChanel() {
        return nameOfChanel;
    }

    public BroadcastsTime getTime() {
        return time;
    }

    public String getNameOfProgramm() {
        return nameOfProgramm;
    }
}
