package by.TMS_Dudak.HomeTaskOOP.Task6.details;

public class Engine {
    private String power;
    private String performance;

    public Engine() {
    }

    public Engine(String power, String performance) {
        this.power = power;
        this.performance = performance;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
