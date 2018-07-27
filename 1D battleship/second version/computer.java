package BattelShip;

public class Computer {
    private int computerShortBoatIndex;
    private int computerLongBoatInitialIndex;

    public Computer(int computerShortBoatIndex, int computerLongBoatInitialIndex) {
        this.computerShortBoatIndex = computerShortBoatIndex;
        this.computerLongBoatInitialIndex = computerLongBoatInitialIndex;
    }

    public void setcomputerShortBoatIndex(int computerShortBoatIndex) {
        this.computerShortBoatIndex = computerShortBoatIndex;
    }

    public void setcomputerLongBoatInitialIndex(int computerLongBoatInitialIndex) {
        this.computerLongBoatInitialIndex = computerLongBoatInitialIndex;
    }

    public int getcomputerShortBoatIndex() {
        return computerShortBoatIndex;
    }

    public int getcomputerLongBoatInitialIndex() {
        return computerLongBoatInitialIndex;
    }
}
