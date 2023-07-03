public class Room {
    private int place;
    private int number;
    private boolean conditionet;
    private boolean wc;
    private boolean tv;
    private boolean reserved;

    public Room(int number, int place, boolean conditionet, boolean wc, boolean tv) {
        this.place = place;
        this.number = number;
        this.conditionet = conditionet;
        this.wc = wc;
        this.tv = tv;
        this.reserved = false;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isConditionet() {
        return conditionet;
    }

    public void setConditionet(boolean conditionet) {
        this.conditionet = conditionet;
    }

    public boolean isWc() {
        return wc;
    }

    public void setWc(boolean wc) {
        this.wc = wc;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }
}
