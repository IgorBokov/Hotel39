public class Room{
    private int place;
    private int number;
    private boolean conditioner;
    private boolean wc;
    private boolean tv;
    private boolean reserved;

    public Room(int number, int place, boolean conditioner, boolean wc, boolean tv) {
        this.place = place;
        this.number = number;
        this.conditioner = conditioner;
        this.wc = wc;
        this.tv = tv;
        this.reserved = false;
    }

    public Room() {
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

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
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
