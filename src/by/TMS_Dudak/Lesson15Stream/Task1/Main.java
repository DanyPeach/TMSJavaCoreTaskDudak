package by.TMS_Dudak.Lesson15Stream.Task1;

import java.beans.IntrospectionException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Hobby hobby1 = new Hobby("IT", new Random().nextInt(0,11));
        Hobby hobby2 = new Hobby("Movie", new Random().nextInt(0,11));
        Hobby hobby3 = new Hobby("Squash", new Random().nextInt(0,11));

        People people1 = new People("Daniil", 19, Gender.MALE, List.of(hobby1, hobby2));
        People people2 = new People("Klim", 19, Gender.MALE, List.of(hobby1));
        People people3 = new People("Victor", 26, Gender.MALE, List.of(hobby1, hobby3));
        People people4 = new People("Artyom", 22, Gender.MALE, List.of(hobby3, hobby2));
        People people5 = new People("Nastia", 20, Gender.FEMALE, List.of(hobby1, hobby2, hobby3));

        List<People> peoples = List.of(people1,people2,people3,people4, people5);

        double average = peoples.stream().mapToInt(People::getAge).average().orElse(0);

        //System.out.println(average);

        //Task2
        List<People> malePeople = peoples.stream().filter(people -> people.getGender() == Gender.MALE).toList();
        //System.out.println(malePeople);

        //Task3^^
        List<People> hobPeople = peoples.stream()
                .filter(people -> people.getHobbies().stream()
                        .anyMatch(hobby -> hobby.getName().equals("IT"))) //anyMatch - проверяет на совпадения, что хотябы одно значение из потока соответсвует ищ щеачме
                .toList();
        //System.out.println(hobPeople);

        //Task4
        List<People> hobPeopleAv = peoples.stream()
                .filter(people -> people.getHobbies().size()>=2)
                .filter(p -> p.getHobbies().stream()
                        .filter(hobby -> hobby.getMark()>1).peek(System.out::println).toList().size()>=2) //anyMatch - проверяет на совпадения, что хотябы одно значение из потока соответсвует ищ щеачме
                .toList();

        //System.out.println(hobPeopleAv);

        //Task5

        //System.out.println(DayOfBirth.isLeapYear(people1.getAge()));
        System.out.println("------------------------------------------------------------------------");
        //peoples.stream().filter(people -> DayOfBirth.isLeapYear(people.getAge())).forEach(System.out::println);


        peoples.stream().filter(people -> {
            return people.getName().toLowerCase().contains("a")&&!people.getName().toLowerCase().contains("b");})
        .forEach(System.out::println);


        System.out.println("------------------------------------------------------------------------");
        //Task6
        peoples.stream().sorted(new MyComparator().reversed()).forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");
        //Task7
        peoples.stream().sorted(new HobbieComparator()).forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");
        //Task8
        peoples.stream().min(Comparator.comparingInt(People::getAge).reversed()
                .thenComparing(new HobbieComparator())).orElse(new People());

        System.out.println("------------------------------------------------------------------------");
        //Task9
        String hello = "Hello";
       Stream.of(hello.toCharArray())
               .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
               .forEach((k,v)-> System.out.println(k));
        int a = 72;
        char c = (char) a;
        System.out.println(c);


        System.out.println("------------------------------------------------------------------------");
        //Task10

        peoples.stream().filter(people -> people.getHobbies().size() == 2).forEach(System.out::println);
    }
}
