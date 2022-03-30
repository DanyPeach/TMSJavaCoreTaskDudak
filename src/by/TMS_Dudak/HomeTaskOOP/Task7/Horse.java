package by.TMS_Dudak.HomeTaskOOP.Task7;

public  class Horse extends Animals {
    private String stamina;

    public Horse(){
        type = "Лошадь";
    }

    public Horse(String food, String location){
        type = "Лошадь";
        this.food=food;
        this.location = location;
    }

    public void makeNoise(String type){
        System.out.println(type);
    }

    public void sleep(){
        System.out.println("Лошадь спит");
    }

    public void eat(){
        System.out.println("Лошадь кушает");
    }
}
