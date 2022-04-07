package by.TMS_Dudak.HomeTaskOOP.InterfaceTask2;

public class Main {
    public static void main(String[] args) {
        Drum drum = new Drum(30);
        Guitar guitar = new Guitar(7);
        Trumpet trumpet = new Trumpet(20);

        Instrument[] instruments = {drum, guitar, trumpet};
        for(Instrument i: instruments){
            i.play();
        }
    }
}
