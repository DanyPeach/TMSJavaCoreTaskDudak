package by.TMS_Dudak.Lesson11.LectureTask;

public class Lecture {
    public static void main(String[] args) {

            //все исключения наследуются от класса throwable, от которого наследуются два класса!
            //еррор - физические ошибки. то что прогер не смодет подправить с помощью кода! (переполнение памяти и тд)

            //начнем с еррора
                //в хип памяти хранятся обхекты, а в стек включается тогда, когда мы используем метод.
                //рекурсия
            //printStackTrace()

        //invokeStackOutOfMemory("Hello");

        //кетчи и ошибки делать по принципу от ущкого к широкому!!! Exception -> RuntimeEx -> что-то дальше
        //блок finally он выполняется всегда. Пишется как я понял в конце кетчев. Он выполняется даже когда ошибок нет

        //finally - не обязательно
        //try finally// try catch //могут быть

        //пробрасывать метод выше

        invokeStackOutOfMemory(4);

        }

        private static void invokeStackOutOfMemory(String line){
            invokeStackOutOfMemory(new String(line));
        }

        private static void invokeStackOutOfMemory(int a){
            invokeStackOutOfMemory(a);
        } //внутри метода создается объект и объект лежит в стеке! когда метод работает стековая память очищается!

}
