package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("300 л. сил", 180, 1300, "Volvo",4,15, "Белый", 2);
        Cargo cargo1 = new Cargo("300", 100, 3000, "MAN", 10, 50,500);
        Cargo cargo2 = new Cargo("420", 90, 3500, "ZTX", 12, 80,700);
        Cargo cargo3 = new Cargo("670", 110, 5000, "LOL", 14, 95,950);
        CitizenAir citizenAir1 = new CitizenAir("2000", 400, 8000, "AirFlot", 25, 520, 200, true);
        CitizenAir citizenAir2 = new CitizenAir("2500", 440, 9200, "Mers", 30, 400, 300, true);
        CitizenAir citizenAir3 = new CitizenAir("3000", 500, 10000, "Riot", 35, 600, 320, true);
        Warfly warfly1 = new Warfly("49", 700, 5000, "Hunter", 15, 200, true, 20);

        Cargo cargoArr[] = {cargo1, cargo2, cargo3};
        CitizenAir citizenAir[] = {citizenAir1, citizenAir2, citizenAir3};

        car1.getInfo();
        System.out.println("\n");
        car1.getRashodnik();
        System.out.println("\n");
        cargo1.getInfo();
        System.out.println("\n");
        cargo1.checkMas(cargoArr);
        System.out.println("\n");
        citizenAir1.pasSpaceInfo(citizenAir);
        System.out.println("\n");
        warfly1.ejectionCheck();



    }
}
