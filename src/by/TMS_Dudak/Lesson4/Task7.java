package by.TMS_Dudak.Lesson4;

public class Task7 {
    public static void main(String[] args) {
        int a = 0;
        for(int i = a; i<=100; i++){
            if(i%2==1){
                a+=i;
            }
        }
        System.out.println("Сумма всех нечетных числео от 1 до 100 равна " + a);
    }
}
