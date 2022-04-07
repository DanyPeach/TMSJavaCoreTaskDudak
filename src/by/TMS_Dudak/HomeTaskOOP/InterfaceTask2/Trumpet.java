package by.TMS_Dudak.HomeTaskOOP.InterfaceTask2;

public class Trumpet implements Instrument {

    private int dmt;

    public Trumpet(int dmt) {
        this.dmt = dmt;
    }

    @Override
    public void play() {
        System.out.println("Сейчас играет Труба! Ее диаметр: " + dmt);
    }

    public int getDmt() {
        return dmt;
    }

    public void setDmt(int dmt) {
        this.dmt = dmt;
    }
}
