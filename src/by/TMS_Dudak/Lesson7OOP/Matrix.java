package by.TMS_Dudak.Lesson7OOP;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int n;
    int m;
    int arr[][] = new int[n][m];


    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.arr =new int[n][m];
    }
    

    public void matrixNew(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количесвто столбцов: ");
        this.n = scanner.nextInt();
        System.out.print("Введите количесвто строк: ");
        this.m = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]= random.nextInt(0,20);
            }
            System.out.println();
        }

    }

    public void matrixPrint() {
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }




}
