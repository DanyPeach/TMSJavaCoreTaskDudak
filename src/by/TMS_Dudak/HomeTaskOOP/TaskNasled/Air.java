package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

public class Air extends Transport{
    private int wings;
    private int minRoad;

    public Air(int wings, int minRoad) {
        this.wings = wings;
        this.minRoad = minRoad;
    }

    public Air(String power, int speed, int weight, String mark, int wings, int minRoad) {
        super(power, speed, weight, mark);
        this.wings = wings;
        this.minRoad = minRoad;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getMinRoad() {
        return minRoad;
    }

    public void setMinRoad(int minRoad) {
        this.minRoad = minRoad;
    }
}
