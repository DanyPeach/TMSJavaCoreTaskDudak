package by.TMS_Dudak.Lesson10;

public class Task2 {
    public static void main(String[] args) {
        int valueA = 3;
        int valueB = 56;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        System.out.println(sb1.append(valueA).append(" + ").append(valueB).append(" = ").append(valueA + valueB).toString());
        System.out.println(sb2.append(valueA).append(" - ").append(valueB).append(" = ").append(valueA - valueB).toString());
        System.out.println(sb3.append(valueA).append(" * ").append(valueB).append(" = ").append(valueA * valueB).toString());
        System.out.println("\n");
        sb1.deleteCharAt(7);
        sb1.insert(7, "равно");
        System.out.println(sb1);
        sb2.replace(7,7,"равно");
        System.out.println(sb2);

    }
}
