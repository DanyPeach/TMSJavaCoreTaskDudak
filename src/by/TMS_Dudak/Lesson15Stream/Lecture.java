package by.TMS_Dudak.Lesson15Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lecture {
    public static void main(String[] args) {
        //Появилось чтобы привнести функционльаный подхоход. Короче очень круто лайки лайк

        int[] numbers = {1,2,2,3,4,5,6,6,5,4,3};
//
//        IntStream intStream = IntStream.of(numbers);
//        IntStream countWithStream = intStream.sorted().distinct();
//        System.out.println(Arrays.toString(countWithStream.toArray()));

        Stream<String> cities = Stream.of("Lol", "Kek", "Da");
        //cities.forEach(System.out::println);
        cities.filter(el -> el.length()==2).forEach(System.out::println);

        //для раюоты с кассами и с стримами можно использовать map который изменяет поток и будет брать опреденные поля для работы

        //промежуточные и терминальные функции
        //промежуточные
        //терминальные функции - это те, которые последние

        //flatMap - какая-то прикольная функция

        //reduce - какая-то сумма хз


    }
}
