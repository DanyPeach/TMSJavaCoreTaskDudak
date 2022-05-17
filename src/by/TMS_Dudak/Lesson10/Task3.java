package by.TMS_Dudak.Lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String sentence = "Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile("Object-oriented programming");//Задаем паттерн (шаблон и поиск подстроки в строке)
        Matcher m = p.matcher(sentence);//возращает тру есом в строке есть подстрока которая совпадает с шаблоном и переходит к этоц строке
        int count = 0;//задаем счетчик
        while(m.find()) {//в цикле пишем метод описанный выше в комменте
           count++;
            System.out.println("Слово " + p + " повторяется в тексте " + count + " раз");

        }
        System.out.println(m);
        m.appendTail(sb);//добавляет хвост после замены
        System.out.println(sb);

    }
}
