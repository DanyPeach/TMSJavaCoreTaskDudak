package by.TMS_Dudak.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Leacture {
    public static void main(String[] args) {
        //scanner. Специфический класс который позволяет читать то, что мы вводим в консоль.
        //не обязательно с консоли, но какой-то входязий поток.
        //Память выделяется при помощи слова new (не любому, но почти всем)
        //Создание сканер:

        Scanner scanner = new Scanner(System.in);
        //мы создаем класс сканер с большой буквы. Дать имя. Написать системный поток (Систем Ин)
        //с клавиатуры мы модем считывать как и строку так и числа.

        System.out.println("Введите фразу: ");
        String a = scanner.nextLine();
        System.out.println("Введите цифру: ");
        int b = scanner.nextInt();
        System.out.println(a + " " + b);


        //nextInt это значит, что нельзя писать другой тип данных кроме того что тут. Точнее он проверяет строку и конвертит если цифра
        //nextLine читает строку до переноса
        //next читает строку до пробела

        //RANDOM
        Random random = new Random();
        //Псевдослучайно число. Псевдо потому что стартует с опреденного значения.
        //bound - это область определения


        //Массивы
        //имеет фиксированное значение
        //набор данных одного типа - массив
        int[] c = new int[5];
        int[]d={1,3,5,7,9};
        System.out.println(d.length);

        int[][] matrix = new int[3][2];
        int[][] lol = {{1, 5}, {5, 6}, {7, 8}};
        System.out.println(lol[0][0]);
    }
}
