package by.TMS_Dudak.HomeTaskOOP.Task7;

public class Vetirinar {
    public void treatAnimal(Animals animals){
        System.out.println("Корм этого питомца ("+ animals.type+ "): " + animals.food);
        System.out.println(animals.type +" зарегистрирован по адресу: " + animals.location);
    }
}
