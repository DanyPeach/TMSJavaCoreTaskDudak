package by.TMS_Dudak.HomeTaskOOP.Task7;

public class Cat extends Animals {
    private String friendliness;

    public Cat(){
        type = "Кот";
    }

    public Cat(String food, String location){
        type = "Кот";
        this.food=food;
        this.location = location;
    }

    public void makeNoise(String type){
        System.out.println(type);
    }

    public void sleep(){
        System.out.println("Кот спит");
    }

    public void eat(){
        System.out.println("Кот кушает");
    }
}
