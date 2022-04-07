package by.TMS_Dudak.HomeTaskOOP.InterfaceTask2;

public class Drum implements Instrument{
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Сейчас играет Барабан! Его размеры в дм: " + size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
