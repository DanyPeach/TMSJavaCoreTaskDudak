package by.TMS_Dudak.Lesson7OOP;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(){

    }

    public Rectangle(String color, int a, int b){
        super(color);
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Reactangle parametrs: a=" + a + " b=" + b+ " colour=" + getColor());
    }
}
