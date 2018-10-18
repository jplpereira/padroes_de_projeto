public class Runway {
    private String runwayNum;
    private boolean inUse;

    public Runway(String runwayNum, boolean inUse) {
        this.runwayNum = runwayNum;
        this.inUse = inUse;
    }

    public String getRunwayNum() {
        return runwayNum;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setRunwayNum(String runwayNum) {
        this.runwayNum = runwayNum;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}