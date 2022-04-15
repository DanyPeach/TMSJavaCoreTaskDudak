package by.TMS_Dudak.HomeTaskOOP.Task8;

public class Circle extends Shape{
    private int x, y;
    private String name = "круг";

    public Circle(int x, int y){
        this.x=x;
        this.y=y;
    }


    public void cord(){
        System.out.println("Координаты фигуры ("+name+")" + x + " " + y);
    }

    public int getCoords() {
        return x;
    }

    public void setCoords(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
