package by.TMS_Dudak.HomeTaskOOP.Task7;

public class Main {
    public static void main(String[] args) {
            Cat cat = new Cat("Фрутоняня", "г. Минск Мястровская 6");
            Dog dog = new Dog("Pedigri", "г. Минск пр Победителей 75");
            Horse horse = new Horse("Kuku", "Узбекистан");
            Vetirinar vetirinar = new Vetirinar();

            cat.makeNoise("Котик прыгает");
            dog.eat();
            horse.sleep();
        System.out.println(cat.type);

            Animals[] animalsArr = {cat, dog, horse};

            for (int i = 0; i< animalsArr.length; i++){
               vetirinar.treatAnimal(animalsArr[i]);
            }
    }
}
