package BattelShip;

public class Player {
    private int playerShortBoatIndex;
    private int playerLongBoatInitialIndex;

    public Player(int playerShortBoatIndex, int playerLongBoatInitialIndex) {
        this.playerShortBoatIndex = playerShortBoatIndex;
        this.playerLongBoatInitialIndex = playerLongBoatInitialIndex;
    }

    public void setplayerShortBoatIndex(int playerShortBoatIndex) {
        this.playerShortBoatIndex = playerShortBoatIndex;
    }

    public void setplayerLongBoatInitialIndex(int playerLongBoatInitialIndex) {
        this.playerLongBoatInitialIndex = playerLongBoatInitialIndex;
    }

    public int getplayerShortBoatIndex() {
        return playerShortBoatIndex;
    }

    public int getplayerLongBoatInitialIndex() {
        return playerLongBoatInitialIndex;
    }
}
