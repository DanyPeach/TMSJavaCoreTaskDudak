package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

public class Ground extends Transport{
    private int amountOfWeels;
    private int oilCount;


    public Ground(int amountOfWeels, int oilCount) {
        this.amountOfWeels = amountOfWeels;
        this.oilCount = oilCount;
    }

    public Ground(String power, int speed, int weight, String mark, int amountOfWeels, int oilCount) {
        super(power, speed, weight, mark);
        this.amountOfWeels = amountOfWeels;
        this.oilCount = oilCount;
    }

    public int getAmountOfWeels() {
        return amountOfWeels;
    }

    public void setAmountOfWeels(int amountOfWeels) {
        this.amountOfWeels = amountOfWeels;
    }

    public int getOilCount() {
        return oilCount;
    }

    public void setOilCount(int oilCount) {
        this.oilCount = oilCount;
    }
}
