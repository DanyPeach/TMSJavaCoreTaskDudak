package by.TMS_Dudak.HomeTaskOOP.InterfaceTask1;

public class Magazine implements Printable{
    private String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Название журнала: " + magazineName);
    }

    public static void printMagazine(Printable[] names){
        for (Printable magazine : names) {
            if (magazine instanceof Magazine) System.out.println(magazine);
        }
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public String toString() {
        return "Название журнала: " +
                "'" + magazineName + '\'';
    }
}
