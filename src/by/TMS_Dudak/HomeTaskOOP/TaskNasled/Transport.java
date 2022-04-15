package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

public class Transport {
    private String power;
    private int speed;
    private int weight;
    private String mark;

    public Transport() {
    }

    public Transport(String power, int speed, int weight, String mark) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.mark = mark;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
