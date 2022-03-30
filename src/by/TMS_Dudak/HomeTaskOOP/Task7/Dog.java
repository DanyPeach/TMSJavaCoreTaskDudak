package by.TMS_Dudak.HomeTaskOOP.Task7;

public class Dog extends Animals {
    private String thoroughbred;

    public Dog(){
        type = "Собака";
    }

    public Dog(String food, String location){
        type = "Собака";
        this.food=food;
        this.location = location;
    }

    public void makeNoise(String type){
        System.out.println(type);
    }

    public void sleep(){
        System.out.println("Собачка спит");
    }

    public void eat(){
        System.out.println("Собачка кушаец ^^");
    }


}
