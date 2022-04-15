package by.TMS_Dudak.HomeTaskOOP.Task8;

public abstract class Shape {
    private String color;
    private String name;

     void draw(String color, String name){
         System.out.println("Нарисован " + color + " " + name);
    }


}
