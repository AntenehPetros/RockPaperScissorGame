package BattelShip;

public class BattleField {
    private String [] battleBoardTop = new String[10];
    private String [] battleBoardMiddle = new String [10];
    private String [] battleBoardBottom = new String [10];


    public BattleField() {
    }

    public String[] getBattleBoardTop() {
        return battleBoardTop;
    }

    public void setBattleBoardTop(String[] battleBoardTop) {
        this.battleBoardTop = battleBoardTop;
    }

    public String[] getBattleBoardMiddle() {
        return battleBoardMiddle;
    }

    public void setBattleBoardMiddle(String[] battleBoardMiddle) {
        this.battleBoardMiddle = battleBoardMiddle;
    }

    public String[] getBattleBoardBottom() {
        return battleBoardBottom;
    }

    public void setBattleBoardBottom(String[] battleBoardBottom) {
        this.battleBoardBottom = battleBoardBottom;
    }
}
