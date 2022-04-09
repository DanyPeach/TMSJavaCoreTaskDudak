package by.TMS_Dudak.HomeTaskOOP.InterfaceTask3;

public enum Seasons {
    WINTER("-100* C"), SPRING("-30 + снег в апреле"), SUMMER("+1000"), AUTHEM("10");

    private String temperature;
    private String description;

    private Seasons(String temperature){
        this.temperature = temperature;
    }

    public String getDescription(String description) {
        return description;
    }

    public String getTemperature() {
        return temperature;
    }

    private Seasons(){

    }



}
