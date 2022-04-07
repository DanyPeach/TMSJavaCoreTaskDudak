package by.TMS_Dudak.HomeTaskOOP.InterfaceTask2;

public class Guitar implements Instrument{
    private int strun;

    public Guitar(int strun) {
        this.strun = strun;
    }

    @Override
    public void play() {
        System.out.println("Сейчас играет Гитара! Количесвто струн: " + strun);
    }

    public int getStrun() {
        return strun;
    }

    public void setStrun(int strun) {
        this.strun = strun;
    }
}
