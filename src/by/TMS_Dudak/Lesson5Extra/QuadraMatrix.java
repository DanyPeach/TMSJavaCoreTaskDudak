package by.TMS_Dudak.Lesson5Extra;

import java.util.Random;
import java.util.Scanner;

public class QuadraMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0, m = 0;

        System.out.print("Введите количество строк в массиве: ");
        n = scanner.nextInt();
        System.out.print("\nВведите количесвто столбцов в массиве: ");
        m = scanner.nextInt();


        int mass[][]=new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                mass[i][j] = random.nextInt(0,99);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
